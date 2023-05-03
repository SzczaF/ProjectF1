package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.*;
import pl.coderslab.projectf1.model.Circuit;

public interface CircuitRepository extends JpaRepository<Circuit, Long> {

}
