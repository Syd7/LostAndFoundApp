package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entity.Location;

@Repository
public interface LocationRepository
	extends JpaRepository<Location, Long>
{
	public Location findByPk(Long pk);
}
