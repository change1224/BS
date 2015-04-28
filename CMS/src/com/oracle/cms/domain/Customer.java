package com.oracle.cms.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1867590811810775579L;
	
	private int id;
	private String name;
	private String gender;
	private String profile;
	private int age;
	
	public Customer() {
		super();
	}

	public Customer(String name, String gender, String profile, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.profile = profile;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
