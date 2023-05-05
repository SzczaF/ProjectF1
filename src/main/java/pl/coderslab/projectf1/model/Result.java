package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resultId", nullable = false)
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

    @Column(name = "number")
    private Integer number;

    @NotNull
    @Column(name = "grid", nullable = false)
    private Integer grid;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @NotNull
    @Column(name = "positionText", nullable = false)
    private String positionText;

    @NotNull
    @Column(name = "positionOrder", nullable = false)
    private Integer positionOrder;

    @NotNull
    @Column(name = "points", nullable = false)
    private Float points;

    @NotNull
    @Column(name = "laps", nullable = false)
    private Integer laps;

    @Size(max = 255)
    @Column(name = "time")
    private String time;

    @Column(name = "milliseconds")
    private Integer milliseconds;

    @Column(name = "fastestLap")
    private Integer fastestLap;

    @Column(name = "rank")
    private Integer rank;

    @Size(max = 255)
    @Column(name = "fastestLapTime")
    private String fastestLapTime;

    @Size(max = 255)
    @Column(name = "fastestLapSpeed")
    private String fastestLapSpeed;

    @NotNull
    @Column(name = "statusId", nullable = false)
    private Integer statusId;

}