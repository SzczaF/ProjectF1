package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "constructorresults")
@Data
public class ConstructorResult {
    @Id
    @Column(name = "constructorResultsId", nullable = false)
    private Integer id;

    @ManyToOne
    @NotEmpty
    private Race races;

    @ManyToOne
    @NotEmpty
    private Constructor constructors;

    @Column(name = "points")
    private Float points;

    @Size(max = 255)
    @NotEmpty
    @Column(name = "status")
    private String status;

}