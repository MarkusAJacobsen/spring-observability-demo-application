package com.github.markusajacobsen.observabilitydemo.data;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "locations")
public class LocationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;
    
    public LocationEntity() {}
    
    public LocationEntity(String name, String region, String country) {
        this.name = name;
        this.region = region;
        this.country = country;
    }
    
    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRegion() {
        return region;
    }
    
    public String getCountry() {
        return country;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
