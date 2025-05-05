package comsep.sneakers.repository;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshRepository  extends JpaRepository<RedisProperties.Lettuce.Cluster.Refresh, Long> {
}
