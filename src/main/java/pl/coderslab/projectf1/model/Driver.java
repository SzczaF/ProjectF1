package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "drivers", indexes = {
        @Index(name = "url", columnList = "url", unique = true)
})
public class Driver {
    @Id
    @Column(name = "driverId", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "driverRef", nullable = false)
    private String driverRef;

    @Column(name = "number")
    private Integer number;

    @Size(max = 3)
    @Column(name = "code", length = 3)
    private String code;

    @Size(max = 255)
    @NotNull
    @Column(name = "forename", nullable = false)
    private String forename;

    @Size(max = 255)
    @NotNull
    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "dob")
    private LocalDate dob;

    @Size(max = 255)
    @Column(name = "nationality")
    private String nationality;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

}