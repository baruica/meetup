package fr.socrates.meetup.reservation.domain;

import java.util.UUID;

public final class MeetupEventId {

    final String value;

    MeetupEventId() {
        this.value = UUID.randomUUID().toString();
    }

    public MeetupEventId(final String meetupEventId) {
        this.value = meetupEventId;
    }
}
