package world.db.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.db.country.model.CountryEntity;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {
}
