package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String Surname;

    @NotEmpty
    @Size(min = 2, max = 20)
    private String userName;

    @Email
    private String mail;

    @NotEmpty
    @Size(min = 8)
    private String password;

}
