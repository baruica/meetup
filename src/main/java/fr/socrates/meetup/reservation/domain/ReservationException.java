package fr.socrates.meetup.reservation.domain;

public final class ReservationException extends Exception {

    private ReservationException(final String message) {
        super(message);
    }

    static ReservationException personWithSameEmailAlreadyExpressedTheirIntentionToAttend() {
        return new ReservationException("Person with same email already registered");
    }
}
