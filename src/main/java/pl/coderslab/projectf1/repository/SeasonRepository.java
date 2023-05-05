package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Season;

public interface SeasonRepository extends JpaRepository<Season, Integer> {
}