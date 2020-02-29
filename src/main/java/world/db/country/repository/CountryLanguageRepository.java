package world.db.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.db.country.model.CountryLanguageEntity;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguageEntity, String> {
}
