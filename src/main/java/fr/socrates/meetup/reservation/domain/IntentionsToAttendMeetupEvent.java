package fr.socrates.meetup.reservation.domain;

import java.util.Set;

public final class IntentionsToAttendMeetupEvent {
    private Set<Person> persons;

    void add(final Person newPerson) throws ReservationException {
        for (Person person : persons) {
            if (person.hasSameEmailAs(newPerson)) {
                throw ReservationException.personWithSameEmailAlreadyExpressedTheirIntentionToAttend();
            }
        }
        persons.add(newPerson);
    }

    boolean contains(final String personEmail) {
        for (Person person : persons) {
            if (person.hasThisEmail(personEmail)) {
                return true;
            }
        }
        return false;
    }
}
