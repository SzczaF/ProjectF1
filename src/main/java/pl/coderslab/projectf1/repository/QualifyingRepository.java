package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Qualifying;

public interface QualifyingRepository extends JpaRepository<Qualifying, Integer> {
}