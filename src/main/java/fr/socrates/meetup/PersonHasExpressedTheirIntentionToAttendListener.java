package fr.socrates.meetup;

import fr.socrates.meetup.reservation.domain.*;
import fr.socrates.meetup.reservation.use_cases.ReserveASpotUseCase;

final class PersonHasExpressedTheirIntentionToAttendListener {

    private final MeetupEventRepository meetupEventRepository;

    public PersonHasExpressedTheirIntentionToAttendListener(final MeetupEventRepository meetupEventRepository) {
        this.meetupEventRepository = meetupEventRepository;
    }

    public void handle(PersonHasExpressedTheirIntentionToAttend event) {
        var reserveASpotUseCase = new ReserveASpotUseCase(meetupEventRepository);

        reserveASpotUseCase.execute(
            new MeetupId(event.meetupEventId),
            event.personEmail
        );
    }
}
