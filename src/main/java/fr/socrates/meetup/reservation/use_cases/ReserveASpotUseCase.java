package fr.socrates.meetup.reservation.use_cases;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.reservation.domain.Meetup;
import fr.socrates.meetup.reservation.domain.MeetupId;
import fr.socrates.meetup.reservation.domain.MeetupEventRepository;

import java.util.Collection;

public final class ReserveASpotUseCase {

    private final MeetupEventRepository meetupEventRepository;

    public ReserveASpotUseCase(final MeetupEventRepository meetupEventRepository) {
        this.meetupEventRepository = meetupEventRepository;
    }

    public void execute(final MeetupId meetupId, final String personEmail) {
        Meetup meetup = meetupEventRepository.get(meetupId);

        Collection<DomainEvent> events = meetup.reserveASpot(personEmail);
    }
}
