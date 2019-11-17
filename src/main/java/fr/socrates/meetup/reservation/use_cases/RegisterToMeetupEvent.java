package fr.socrates.meetup.reservation.use_cases;

import fr.socrates.meetup.DomainEvent;
import fr.socrates.meetup.DomainEventPublisher;
import fr.socrates.meetup.reservation.domain.*;

import java.util.Collection;

final class RegisterToMeetupEvent {

    private final MeetupEventRepository meetupEventRepository;
    private final DomainEventPublisher domainEventPublisher;
    private IntentionsToAttendMeetupEvent intentionsToAttendMeetupEvent;

    public RegisterToMeetupEvent(final MeetupEventRepository meetupEventRepository, final DomainEventPublisher domainEventPublisher) {
        this.meetupEventRepository = meetupEventRepository;
        this.domainEventPublisher = domainEventPublisher;
    }

    public void execute(Person person, MeetupId meetupId) throws ReservationException {
        Meetup meetup = meetupEventRepository.get(meetupId);

        Collection<DomainEvent> events = meetup.expressIntentionToAttend(person);

        meetupEventRepository.persist(meetup);

        domainEventPublisher.publishAll(events);
    }
}
