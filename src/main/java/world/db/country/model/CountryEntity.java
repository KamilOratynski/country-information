package world.db.country.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "country", schema = "public", catalog = "world-db")
public class CountryEntity {
    private String code;
    private String name;
    private String continent;
    private String region;
    private float surfaceArea;
    private Short indepYear;
    private int population;
    private Float lifeExpectancy;
    private BigDecimal gnp;
    private BigDecimal gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private String code2;
    private CityEntity cityByCapital;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public CountryEntity setCode(String code) {
        this.code = code;
        return this;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public CountryEntity setName(String name) {
        this.name = name;
        return this;
    }

    @Basic
    @Column(name = "continent")
    public String getContinent() {
        return continent;
    }

    public CountryEntity setContinent(String continent) {
        this.continent = continent;
        return this;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public CountryEntity setRegion(String region) {
        this.region = region;
        return this;
    }

    @Basic
    @Column(name = "surface_area")
    public float getSurfaceArea() {
        return surfaceArea;
    }

    public CountryEntity setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
        return this;
    }

    @Basic
    @Column(name = "indep_year")
    public Short getIndepYear() {
        return indepYear;
    }

    public CountryEntity setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
        return this;
    }

    @Basic
    @Column(name = "population")
    public int getPopulation() {
        return population;
    }

    public CountryEntity setPopulation(int population) {
        this.population = population;
        return this;
    }

    @Basic
    @Column(name = "life_expectancy")
    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public CountryEntity setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
        return this;
    }

    @Basic
    @Column(name = "gnp")
    public BigDecimal getGnp() {
        return gnp;
    }

    public CountryEntity setGnp(BigDecimal gnp) {
        this.gnp = gnp;
        return this;
    }

    @Basic
    @Column(name = "gnp_old")
    public BigDecimal getGnpOld() {
        return gnpOld;
    }

    public CountryEntity setGnpOld(BigDecimal gnpOld) {
        this.gnpOld = gnpOld;
        return this;
    }

    @Basic
    @Column(name = "local_name")
    public String getLocalName() {
        return localName;
    }

    public CountryEntity setLocalName(String localName) {
        this.localName = localName;
        return this;
    }

    @Basic
    @Column(name = "government_form")
    public String getGovernmentForm() {
        return governmentForm;
    }

    public CountryEntity setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
        return this;
    }

    @Basic
    @Column(name = "head_of_state")
    public String getHeadOfState() {
        return headOfState;
    }

    public CountryEntity setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
        return this;
    }

    @Basic
    @Column(name = "code2")
    public String getCode2() {
        return code2;
    }

    public CountryEntity setCode2(String code2) {
        this.code2 = code2;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (Float.compare(that.surfaceArea, surfaceArea) != 0) return false;
        if (population != that.population) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (continent != null ? !continent.equals(that.continent) : that.continent != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (indepYear != null ? !indepYear.equals(that.indepYear) : that.indepYear != null) return false;
        if (lifeExpectancy != null ? !lifeExpectancy.equals(that.lifeExpectancy) : that.lifeExpectancy != null)
            return false;
        if (gnp != null ? !gnp.equals(that.gnp) : that.gnp != null) return false;
        if (gnpOld != null ? !gnpOld.equals(that.gnpOld) : that.gnpOld != null) return false;
        if (localName != null ? !localName.equals(that.localName) : that.localName != null) return false;
        if (governmentForm != null ? !governmentForm.equals(that.governmentForm) : that.governmentForm != null)
            return false;
        if (headOfState != null ? !headOfState.equals(that.headOfState) : that.headOfState != null) return false;
        if (code2 != null ? !code2.equals(that.code2) : that.code2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (surfaceArea != +0.0f ? Float.floatToIntBits(surfaceArea) : 0);
        result = 31 * result + (indepYear != null ? indepYear.hashCode() : 0);
        result = 31 * result + population;
        result = 31 * result + (lifeExpectancy != null ? lifeExpectancy.hashCode() : 0);
        result = 31 * result + (gnp != null ? gnp.hashCode() : 0);
        result = 31 * result + (gnpOld != null ? gnpOld.hashCode() : 0);
        result = 31 * result + (localName != null ? localName.hashCode() : 0);
        result = 31 * result + (governmentForm != null ? governmentForm.hashCode() : 0);
        result = 31 * result + (headOfState != null ? headOfState.hashCode() : 0);
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "capital", referencedColumnName = "id")
    public CityEntity getCityByCapital() {
        return cityByCapital;
    }

    public CountryEntity setCityByCapital(CityEntity cityByCapital) {
        this.cityByCapital = cityByCapital;
        return this;
    }
}
