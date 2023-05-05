package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}