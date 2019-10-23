package fr.socrates.meetup;

import fr.socrates.meetup.meetup_group.domain.MeetupGroupMemberId;

public final class MeetupGroupMemberDidNotShowUp extends DomainEvent {
    public final MeetupGroupMemberId meetupGroupMemberId;

    public MeetupGroupMemberDidNotShowUp(final MeetupGroupMemberId meetupGroupMemberId) {
        this.meetupGroupMemberId = meetupGroupMemberId;
    }
}
