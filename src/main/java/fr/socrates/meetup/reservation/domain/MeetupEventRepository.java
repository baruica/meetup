package fr.socrates.meetup.reservation.domain;

public interface MeetupEventRepository {
    MeetupEvent get(final MeetupEventId meetupEventId);

    void persist(MeetupEvent meetupEvent);
}
