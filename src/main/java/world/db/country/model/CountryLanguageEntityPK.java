package world.db.country.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CountryLanguageEntityPK implements Serializable {
    private String countryCode;
    private String language;

    @Column(name = "country_code")
    @Id
    public String getCountryCode() {
        return countryCode;
    }

    public CountryLanguageEntityPK setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @Column(name = "language")
    @Id
    public String getLanguage() {
        return language;
    }

    public CountryLanguageEntityPK setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguageEntityPK that = (CountryLanguageEntityPK) o;

        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
