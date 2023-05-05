package pl.coderslab.projectf1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status {
    @Id
    @Column(name = "statusId", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "status", nullable = false)
    private String status;

}