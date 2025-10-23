package model.user;

import jakarta.persistence.*;
import lombok.*;
import model.project.Project;
import model.task.Task;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String login;

    private String password;

    private UserRole userRole;

    private Project project;

    private Task assignedTask;
}





