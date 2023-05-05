package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.LapTimeId;
import pl.coderslab.projectf1.model.LapTime;

public interface LapTimeRepository extends JpaRepository<LapTime, LapTimeId> {
}