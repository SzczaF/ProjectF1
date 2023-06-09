package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "qualifying")
public class Qualifying {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qualifyId", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "raceId", nullable = false)
    private Integer raceId;

    @NotNull
    @Column(name = "driverId", nullable = false)
    private Integer driverId;

    @NotNull
    @Column(name = "constructorId", nullable = false)
    private Integer constructorId;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "q1")
    private String q1;

    @Size(max = 255)
    @Column(name = "q2")
    private String q2;

    @Size(max = 255)
    @Column(name = "q3")
    private String q3;

}