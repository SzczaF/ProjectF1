package pl.coderslab.projectf1.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull
    private LocalDateTime dateTime;

    @NotEmpty
    @Size(max = 255)
    private String title;

    @NotEmpty
    @Size(max = 1000)
    private String description;

    @NotEmpty
    @Size(max = 5000)
    private String text;

    @NotEmpty
    @Size(max = 255)
    private String url;

    @ManyToOne
    @NotNull
    @JoinColumn(name="userId")
    private User user;

}
