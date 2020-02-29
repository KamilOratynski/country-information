package world.db.country.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import world.db.country.model.CountryEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private String name;
    private String continent;
    private int population;
    private Float life_expectancy;
    private String country_language;

    public CountryDTO(CountryEntity entity) {
        this.name = entity.getName();
        this.continent = entity.getContinent();
        this.population = entity.getPopulation();
        this.life_expectancy = entity.getLifeExpectancy();
        this.country_language = "country_language";
    }
}