package comsep.sneakers.repository;

import comsep.sneakers.model.Sneakers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakersRepository extends JpaRepository<Sneakers, Long> {
}
