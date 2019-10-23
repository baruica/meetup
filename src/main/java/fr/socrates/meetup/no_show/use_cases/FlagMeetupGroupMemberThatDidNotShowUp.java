package fr.socrates.meetup.no_show.use_cases;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.DomainEventPublisher;
import fr.socrates.meetup.meetup_group.domain.MeetupGroupMember;
import fr.socrates.meetup.meetup_group.domain.MeetupGroupMemberId;
import fr.socrates.meetup.meetup_group.domain.MeetupGroupMemberRepository;

import java.util.Collection;

final class FlagMeetupGroupMemberThatDidNotShowUp {

    private final DomainEventPublisher domainEventPublisher;
    private final MeetupGroupMemberRepository meetupGroupMemberRepository;

    public FlagMeetupGroupMemberThatDidNotShowUp(final DomainEventPublisher domainEventPublisher, final MeetupGroupMemberRepository meetupGroupMemberRepository) {
        this.domainEventPublisher = domainEventPublisher;
        this.meetupGroupMemberRepository = meetupGroupMemberRepository;
    }

    public void execute(MeetupGroupMemberId meetupGroupMemberId) {
        MeetupGroupMember meetupGroupMember = meetupGroupMemberRepository.get(meetupGroupMemberId);
        Collection<DomainEvent> events = meetupGroupMember.flagNoShow();
        meetupGroupMemberRepository.persist(meetupGroupMember);
        domainEventPublisher.publishAll(events);
    }
}
