package io.matheusvictor.user.microservice.producers;

import io.matheusvictor.user.microservice.domain.user.User;

public interface UserProducer {
    void publishMessageEmail(User user);
}
