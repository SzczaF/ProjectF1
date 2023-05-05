package pl.coderslab.projectf1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class LapTimeId implements Serializable {
    private static final long serialVersionUID = 2283550850355344516L;
    @NotNull
    @Column(name = "raceId", nullable = false)
    private Integer raceId;

    @NotNull
    @Column(name = "driverId", nullable = false)
    private Integer driverId;

    @NotNull
    @Column(name = "lap", nullable = false)
    private Integer lap;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LapTimeId entity = (LapTimeId) o;
        return Objects.equals(this.raceId, entity.raceId) &&
                Objects.equals(this.driverId, entity.driverId) &&
                Objects.equals(this.lap, entity.lap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, driverId, lap);
    }

}