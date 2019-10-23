package fr.socrates.meetup.reservation.use_cases;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.reservation.domain.MeetupEvent;
import fr.socrates.meetup.reservation.domain.MeetupEventId;
import fr.socrates.meetup.reservation.domain.MeetupEventRepository;

import java.util.Collection;

public final class ReserveASpotUseCase {

    private final MeetupEventRepository meetupEventRepository;

    public ReserveASpotUseCase(final MeetupEventRepository meetupEventRepository) {
        this.meetupEventRepository = meetupEventRepository;
    }

    public void execute(final MeetupEventId meetupEventId, final String personEmail) {
        MeetupEvent meetupEvent = meetupEventRepository.get(meetupEventId);

        Collection<DomainEvent> events = meetupEvent.reserveASpot(personEmail);
    }
}
