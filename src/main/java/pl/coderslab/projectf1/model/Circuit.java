package pl.coderslab.projectf1.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Null;
import javax.validation.constraints.Size;


@Entity
@Table(name = "circuits")
@Data
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long circuitId;
    @Size(max = 255)
    String circuitRef;
    @Size(max = 255)
    String name;
    @Size(max = 255)
    String location;
    @Size(max = 255)
    String country;
    float lat;
    float lng;
    Integer alt;
    @Size(max = 255)
    String url;

}
