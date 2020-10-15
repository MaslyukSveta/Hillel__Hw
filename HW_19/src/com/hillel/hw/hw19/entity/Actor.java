package com.hillel.hw.hw19.entity;

import java.util.Date;

public class Actor {
	
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String BIRTHDAY = "birthday";
    
	private int id;
	private String name;
	private Date birthday;
	
	public void name() {
		
	} 
	public Actor(int id, String name, Date birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public int getId() {
        return id;
    }
	public String getName() {
        return name;
    }
	public Date getBirthday() {
        return birthday;
    }
	
	public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return id + " " + name + " " + birthday;
    }
}

