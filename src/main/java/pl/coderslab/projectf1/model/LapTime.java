package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "laptimes", indexes = {
        @Index(name = "raceId", columnList = "raceId")
})
public class LapTime {
    @EmbeddedId
    private LapTimeId id;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "time")
    private String time;

    @Column(name = "milliseconds")
    private Integer milliseconds;

}