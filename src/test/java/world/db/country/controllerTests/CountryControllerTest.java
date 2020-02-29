package world.db.country.controllerTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import world.db.country.controller.dto.CountryDTO;
import world.db.country.service.CountryService;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CountryControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CountryService countryService;

    @Test
    public void givenNotExistingCountryCode_whenFindByCountryCode_thenReturnNotFound() throws Exception {
        mockMvc
                .perform(get("/KOO"))
                .andExpect(status().isInternalServerError())
                .andExpect(status().reason(("INVALID_COUNTRY_CODE")));
    }

    @Test
    public void givenExistingCountryCodeBHR_whenFindByCountryCode_thenReturnCountry() throws Exception {
        when(countryService.findByCountryCode("BHR")).thenReturn(Optional.of(getCountry("Bahrain", "Asia", 617000, 73F, "Arabic")));

        mockMvc.perform(get("/BHR"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Bahrain")))
                .andExpect(jsonPath("$.continent", is("Asia")))
                .andExpect(jsonPath("$.population", is(617000)))
                .andExpect(jsonPath("$.life_expectancy", is(73.0)))
                .andExpect(jsonPath("$.country_language", is("Arabic")));

        verify(countryService, times(1)).findByCountryCode("BHR");
    }

    @Test
    public void givenExistingCountryCodePOL_whenFindByCountryCode_thenReturnCountry() throws Exception {
        when(countryService.findByCountryCode("POL")).thenReturn(Optional.of(getCountry("Poland", "Europe", 38653600, 73.2F, "Polish")));

        mockMvc.perform(get("/POL"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Poland")))
                .andExpect(jsonPath("$.continent", is("Europe")))
                .andExpect(jsonPath("$.population", is(38653600)))
                .andExpect(jsonPath("$.life_expectancy", is(73.2)))
                .andExpect(jsonPath("$.country_language", is("Polish")));

        verify(countryService, times(1)).findByCountryCode("POL");
    }

    private CountryDTO getCountry(String name, String continent, int population, Float life_expectancy, String country_language) {
        return CountryDTO.builder()
                .name(name)
                .continent(continent)
                .population(population)
                .life_expectancy(life_expectancy)
                .country_language(country_language)
                .build();
    }
}