package world.db.country.service;

import org.springframework.stereotype.Service;
import world.db.country.controller.dto.CountryDTO;
import world.db.country.model.CountryLanguageEntity;
import world.db.country.repository.CountryLanguageRepository;
import world.db.country.repository.CountryRepository;

import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;
    private final CountryLanguageRepository countryLanguageRepository;

    public CountryService(CountryRepository countryRepository, CountryLanguageRepository countryLanguageRepository) {
        this.countryRepository = countryRepository;
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public Optional<CountryDTO> findByCountryCode(String code) {
        CountryDTO countryDto = getCountryDto(code);
        return Optional.ofNullable(countryDto);
    }

    private CountryDTO getCountryDto(String code) {
        return countryRepository
                .findById(code)
                .map(CountryDTO::new)
                .map(countryDTO -> setLanguage(countryDTO, code))
                .orElse(null);
    }

    private String getLanguage(String code) {
        return countryLanguageRepository
                .findAll()
                .stream()
                .filter(e -> e.getCountryCode().equals(code))
                .findFirst()
                .map(CountryLanguageEntity::getLanguage)
                .orElse("unknown");
    }

    private CountryDTO setLanguage(CountryDTO countryDto, String code) {
        countryDto.setCountry_language(getLanguage(code));
        return countryDto;
    }
}