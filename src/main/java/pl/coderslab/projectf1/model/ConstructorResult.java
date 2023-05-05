package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "constructorResults")
@Data
public class ConstructorResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @NotNull
    @JoinColumn(name="raceId")
    private Race races;

    @ManyToOne
    @NotNull
    @JoinColumn(name="constructorId")
    private Constructor constructors;

    @Column(name = "points")
    private Float points;

    @Size(max = 255)
    @Column(name = "status")
    private String status;

}