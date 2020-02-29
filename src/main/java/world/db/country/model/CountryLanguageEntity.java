package world.db.country.model;

import javax.persistence.*;

@Entity
@Table(name = "country_language", schema = "public", catalog = "world-db")
@IdClass(CountryLanguageEntityPK.class)
public class CountryLanguageEntity {
    private String countryCode;
    private String language;
    private boolean isOfficial;
    private float percentage;
    private CountryEntity countryByCountryCode;

    @Id
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public CountryLanguageEntity setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @Id
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public CountryLanguageEntity setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Basic
    @Column(name = "is_official")
    public boolean isOfficial() {
        return isOfficial;
    }

    public CountryLanguageEntity setOfficial(boolean official) {
        isOfficial = official;
        return this;
    }

    @Basic
    @Column(name = "percentage")
    public float getPercentage() {
        return percentage;
    }

    public CountryLanguageEntity setPercentage(float percentage) {
        this.percentage = percentage;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguageEntity that = (CountryLanguageEntity) o;

        if (isOfficial != that.isOfficial) return false;
        if (Float.compare(that.percentage, percentage) != 0) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (isOfficial ? 1 : 0);
        result = 31 * result + (percentage != +0.0f ? Float.floatToIntBits(percentage) : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "country_code", referencedColumnName = "code", nullable = false)
    public CountryEntity getCountryByCountryCode() {
        return countryByCountryCode;
    }

    public CountryLanguageEntity setCountryByCountryCode(CountryEntity countryByCountryCode) {
        this.countryByCountryCode = countryByCountryCode;
        return this;
    }
}
