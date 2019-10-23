package fr.socrates.meetup.reservation.domain;

import fr.socrates.meetup.DomainEvent;

public final class PersonHasExpressedTheirIntentionToAttend extends DomainEvent {
    public final String meetupEventId;
    public final String personEmail;

    PersonHasExpressedTheirIntentionToAttend(final String meetupEventId, final String personEmail) {
        this.meetupEventId = meetupEventId;
        this.personEmail = personEmail;
    }
}
