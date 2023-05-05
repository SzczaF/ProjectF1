package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.ConstructorResult;

import java.util.List;

public interface ConstructorResultRepository extends JpaRepository<ConstructorResult, Integer> {

List<ConstructorResult> findFirst10ByOrderById();
}