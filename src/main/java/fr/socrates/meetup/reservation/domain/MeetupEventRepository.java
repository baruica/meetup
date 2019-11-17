package fr.socrates.meetup.reservation.domain;

public interface MeetupEventRepository {
    Meetup get(final MeetupId meetupId);

    void persist(Meetup meetup);
}
