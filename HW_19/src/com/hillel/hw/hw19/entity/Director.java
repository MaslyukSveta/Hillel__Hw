package com.hillel.hw.hw19.entity;

import java.util.Date;

public class Director extends Actor {
	
	private int id;
	private String name;
	private Date birthday;
	
	public Director(int id, String name, Date birthday) {
		super(id, name, birthday);
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
