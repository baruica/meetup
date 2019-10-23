package fr.socrates.meetup.meetup_group.domain;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.no_show.domain.MeetupGroupMemberHasBeenFlagged;

import java.util.Collection;
import java.util.List;

public final class MeetupGroupMember {
    private final MeetupGroupMemberId meetupGroupMemberId;
    private int noShowFlagsCounter = 0;

    public MeetupGroupMember(final MeetupGroupMemberId meetupGroupMemberId) {
        this.meetupGroupMemberId = meetupGroupMemberId;
    }

    public Collection<DomainEvent> flagNoShow() {
        this.noShowFlagsCounter++;
        return List.of(new MeetupGroupMemberHasBeenFlagged(this.meetupGroupMemberId));
    }
}
