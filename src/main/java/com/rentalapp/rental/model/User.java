package com.rentalapp.rental.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)

public class User {

    private int id;
    private String name;
    private String surname;
    private Date birthdate;
    private Date driving_license_date;
    private String driving_license_number;
    private String user_name;
    private String password;

    private int age;
    private int agePermis;

    public User() {

    }

    public User(int id, String name, String surname, Date birthdate, Date driving_license_date, String driving_license_number,String user_name, String password, int age, int agePermis  ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.driving_license_date = driving_license_date;
        this.driving_license_number = driving_license_number;
        this.user_name = user_name;
        this.password = password;

        this.age = age;
        this.agePermis = agePermis;
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

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate(){ return birthdate; }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getDriving_license_date(){ return driving_license_date; }
    public void setDriving_license_date(Date driving_license_date) {
        this.driving_license_date = driving_license_date;
    }

    public String getDriving_license_number(){ return driving_license_number; }
    public void setDriving_license_number(String driving_license_number) { this.driving_license_number = driving_license_number; }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.surname = user_name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public int getAge() {
        return age;
    }
    public void age(int age) {
        this.age = age;
    }

    public int getAgePermis() {
        return agePermis;
    }
    public void setAgePermis(int agePermis) {
        this.agePermis = agePermis;
    }

}
