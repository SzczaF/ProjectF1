package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.DriverStanding;

public interface DriverStandingRepository extends JpaRepository<DriverStanding, Integer> {
}