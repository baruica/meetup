package fr.socrates.meetup.reservation.domain;

import fr.socrates.meetup.DomainEvent;

import java.util.Collection;
import java.util.List;

public final class Meetup {

    private final MeetupId id;
    private final IntentionsToAttendMeetupEvent intentionsToAttendMeetupEvent;

    public Meetup() {
        this.id = new MeetupId();
        this.intentionsToAttendMeetupEvent = new IntentionsToAttendMeetupEvent();
    }

    public Collection<DomainEvent> expressIntentionToAttend(final Person person) throws ReservationException {
        intentionsToAttendMeetupEvent.add(person);

        return List.of(
            new PersonHasExpressedTheirIntentionToAttend(
                this.id.value,
                person.email()
            )
        );
    }
}
