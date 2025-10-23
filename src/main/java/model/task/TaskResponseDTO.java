package model.task;

import org.springframework.boot.context.properties.bind.DefaultValue;

public record TaskResponseDTO(

        Long id,
        String title,
        ProgressionStatus progressionStatus,
        String description,

        @DefaultValue("Unassigned")
        String attributedTo

) {
}
