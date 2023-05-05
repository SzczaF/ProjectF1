package pl.coderslab.projectf1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "constructorstandings")
public class ConstructorStanding {
    @Id
    @Column(name = "constructorStandingsId", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "raceId", nullable = false)
    private Integer raceId;

    @NotNull
    @Column(name = "constructorId", nullable = false)
    private Integer constructorId;

    @NotNull
    @Column(name = "points", nullable = false)
    private Float points;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "positionText")
    private String positionText;

    @NotNull
    @Column(name = "wins", nullable = false)
    private Integer wins;

}