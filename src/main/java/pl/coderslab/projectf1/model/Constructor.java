package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name="constructors")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int constructorId;
    @Size(max = 255)
    String constructorRef;
    @Size(max = 255)
    String name;
    @Size(max = 255)
    String nationality;
    @Size(max = 255)
    String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Constructor that = (Constructor) o;
        return getConstructorId() != null && Objects.equals(getConstructorId(), that.getConstructorId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
