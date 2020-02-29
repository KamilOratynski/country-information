package world.db.country.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import world.db.country.controller.dto.CountryDTO;
import world.db.country.service.CountryService;
import world.db.country.util.CountryNotFoundException;

import java.util.Optional;

@RestController
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{countryCode}")
    public ResponseEntity<CountryDTO> getByCountryCode(@PathVariable("countryCode") String code) {
        Optional<CountryDTO> country = countryService.findByCountryCode(code);
        return country
                .map(ResponseEntity::ok)
                .orElseThrow(CountryNotFoundException::new);
    }
}