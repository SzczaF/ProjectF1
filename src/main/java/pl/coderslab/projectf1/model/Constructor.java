package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import lombok.Data;

import jakarta.validation.constraints.Size;

@Entity
@Table(name="constructors")
@Data
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer constructorId;
    @Size(max = 255)
    String constructorRef;
    @Size(max = 255)
    String name;
    @Size(max = 255)
    String nationality;
    @Size(max = 255)
    String url;
}
