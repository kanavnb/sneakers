package comsep.sneakers.repository;

import comsep.sneakers.model.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SneakersRepository extends JpaRepository<Sneaker, Long> {
}
