package fr.socrates.meetup;

import java.util.Collection;

public interface DomainEventPublisher {
    void publishAll(Collection<DomainEvent> domainEvent);
}
