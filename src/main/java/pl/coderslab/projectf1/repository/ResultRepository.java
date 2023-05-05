package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Result;

public interface ResultRepository extends JpaRepository<Result, Integer> {
}