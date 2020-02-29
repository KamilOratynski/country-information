package world.db.country.model;

import javax.persistence.*;

@Entity
@Table(name = "city", schema = "public", catalog = "world-db")
public class CityEntity {
    private int id;
    private String name;
    private String district;
    private int population;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public CityEntity setId(int id) {
        this.id = id;
        return this;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public CityEntity setName(String name) {
        this.name = name;
        return this;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public CityEntity setDistrict(String district) {
        this.district = district;
        return this;
    }

    @Basic
    @Column(name = "population")
    public int getPopulation() {
        return population;
    }

    public CityEntity setPopulation(int population) {
        this.population = population;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (id != that.id) return false;
        if (population != that.population) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + population;
        return result;
    }
}
