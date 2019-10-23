package fr.socrates.meetup.reservation.domain;

import fr.socrates.meetup.DomainEvent;

import java.util.Collection;
import java.util.List;

public final class MeetupEvent {

    private final MeetupEventId id;
    private final IntentionsToAttendMeetupEvent intentionsToAttendMeetupEvent;

    public MeetupEvent() {
        this.id = new MeetupEventId();
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
