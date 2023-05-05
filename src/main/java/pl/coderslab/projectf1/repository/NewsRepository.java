package pl.coderslab.projectf1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.projectf1.model.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}