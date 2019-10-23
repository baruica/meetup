package fr.socrates.meetup.reservation.domain;

public final class Person {
    private Email email;

    boolean hasSameEmailAs(final Person person) {
        return email.value.equals(person.email.value);
    }

    String email() {
        return email.value;
    }

    boolean hasThisEmail(final String personEmail) {
        return email.value.equals(personEmail);
    }
}
