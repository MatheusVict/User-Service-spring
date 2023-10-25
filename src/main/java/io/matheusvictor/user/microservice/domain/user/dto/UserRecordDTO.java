package io.matheusvictor.user.microservice.domain.user.dto;

import io.matheusvictor.user.microservice.domain.user.User;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(
        @NotBlank
        String name,

        @NotBlank
        String email
) {

}
