package com.example.demo.web.entity;

public class User {
	private String name;
    private String sex;
    private String hobby;

    public User() {
        super();
    }
    public User(String name, String sex, String hobby) {
        super();
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
