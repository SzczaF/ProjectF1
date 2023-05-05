package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Constructor;

public interface ConstructorRepository extends JpaRepository<Constructor, Integer> {
}