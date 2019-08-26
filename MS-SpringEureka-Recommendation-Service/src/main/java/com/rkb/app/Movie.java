package com.rkb.app;
public class Movie {
    private Integer id;

    private String name;

    private String synopsis;

	public Movie(int id, String name, String synopsis) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.synopsis=synopsis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

    // getters and setters
    
}