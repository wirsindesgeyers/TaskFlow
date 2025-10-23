package model.project.dto;

import jakarta.validation.constraints.NotBlank;

public record ProjectRequestDTO(
        @NotBlank(message = "Title cannot be blank")
        String title,

        @NotBlank(message = "Description cannot be blank")
        String description
) {
}
