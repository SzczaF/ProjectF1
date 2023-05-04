package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "circuits")
@Data
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int circuitId;

    @NotBlank
    @Size(max = 255)
    String name;

    @Size(max = 255)
    String circuitRef;

    @Size(max = 255)
    String location;

    @NotBlank
    @Size(max = 255)
    String country;

    float lat;

    float lng;

    Integer alt;

    @Size(max = 255)
    String url;

}
