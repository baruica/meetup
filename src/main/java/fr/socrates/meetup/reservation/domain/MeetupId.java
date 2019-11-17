package fr.socrates.meetup.reservation.domain;

import java.util.UUID;

public final class MeetupId {

    final String value;

    MeetupId() {
        this.value = UUID.randomUUID().toString();
    }

    public MeetupId(final String meetupEventId) {
        this.value = meetupEventId;
    }
}
