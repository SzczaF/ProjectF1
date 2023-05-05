package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "races", indexes = {
        @Index(name = "url", columnList = "url", unique = true)
})
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raceId", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "year", nullable = false)
    private Integer year;

    @NotNull
    @Column(name = "round", nullable = false)
    private Integer round;

    @NotNull
    @Column(name = "circuitId", nullable = false)
    private Integer circuitId;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Size(max = 255)
    @Column(name = "url")
    private String url;

    @Column(name = "fp1_date")
    private LocalDate fp1Date;

    @Column(name = "fp1_time")
    private LocalTime fp1Time;

    @Column(name = "fp2_date")
    private LocalDate fp2Date;

    @Column(name = "fp2_time")
    private LocalTime fp2Time;

    @Column(name = "fp3_date")
    private LocalDate fp3Date;

    @Column(name = "fp3_time")
    private LocalTime fp3Time;

    @Column(name = "quali_date")
    private LocalDate qualiDate;

    @Column(name = "quali_time")
    private LocalTime qualiTime;

    @Column(name = "sprint_date")
    private LocalDate sprintDate;

    @Column(name = "sprint_time")
    private LocalTime sprintTime;


    public String getNameAndYear(){
        return name + " " + year;
    }
}