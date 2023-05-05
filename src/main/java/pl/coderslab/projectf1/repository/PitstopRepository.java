package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.Pitstop;
import pl.coderslab.projectf1.model.PitstopId;

public interface PitstopRepository extends JpaRepository<Pitstop, PitstopId> {
}