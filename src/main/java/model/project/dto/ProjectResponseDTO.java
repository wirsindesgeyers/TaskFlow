package model.project.dto;

import jakarta.validation.constraints.*;

public record ProjectResponseDTO(
        @NotNull
        Long id,

        String title,

        String description
) {
}
