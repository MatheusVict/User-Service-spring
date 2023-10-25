package io.matheusvictor.user.microservice.repository;

import io.matheusvictor.user.microservice.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
