package fr.socrates.meetup.no_show.domain;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.meetup_group.domain.MeetupGroupMemberId;

public final class MeetupGroupMemberHasBeenFlagged extends DomainEvent {
    public final MeetupGroupMemberId meetupGroupMemberId;

    public MeetupGroupMemberHasBeenFlagged(final MeetupGroupMemberId meetupGroupMemberId) {
        this.meetupGroupMemberId = meetupGroupMemberId;
    }
}
