package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.SprintResult;

public interface SprintResultRepository extends JpaRepository<SprintResult, Integer> {
}