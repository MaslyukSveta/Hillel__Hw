package com.hillel.hw.hw19.entity;

import java.util.List;
import java.util.stream.Collectors;

public class Film {
	
	private int id;
	private String name;
    private Director director;
    private int release;
    private String country;
    private List<Actor> actors;

    public Film(int id, String name, Director director, int releaseYear, String country, List<Actor> actors) {
    	
    	this.id = id;
    	this.name = name;
        this.director = director;
        this.release = releaseYear;
        this.country = country;
        this.actors = actors;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return release;
    }

    public String getCountry() {
        return country;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String toString() {
        return name + "  " + director.getName() + " " + release + " " + country + " | "
                + actors.stream().map((actor) -> actor.getName()).collect(Collectors.toList()) + "\n";
    }

}
