package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}