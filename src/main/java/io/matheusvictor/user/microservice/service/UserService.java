package io.matheusvictor.user.microservice.service;

import io.matheusvictor.user.microservice.domain.user.User;
import io.matheusvictor.user.microservice.domain.user.dto.UserRecordDTO;

public interface UserService {
    User saveUser(User user);
}
