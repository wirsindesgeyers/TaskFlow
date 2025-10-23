package model.task;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(

        @NotBlank(message = "Title cant be blank")
        String title,

        @NotBlank(message = "Progression status cant be blank")
        ProgressionStatus progressionStatus,

        @NotBlank(message = "Description cant be blank")
        String description

) {
}
