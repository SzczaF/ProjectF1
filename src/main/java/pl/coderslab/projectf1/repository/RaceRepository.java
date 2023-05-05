package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Race;

public interface RaceRepository extends JpaRepository<Race, Integer> {
}