package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seasons", indexes = {
        @Index(name = "url", columnList = "url", unique = true)
})
public class Season {
    @Id
    @Column(name = "year", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

}