package com.rentalapp.rental.model;

public class Car {


    private int id;
    private String Registration;
    private String Mark;
    private String Model;
    private String Color;
    private int CV;
    private int Dayprice;
    private boolean Isactif;

    public Car(){

    }


    public Car( String registration, String mark, String model, String color, int cv, int dayPrice) {
        Registration = registration;
        Mark = mark;
        Model = model;
        Color = color;
        CV = cv;
        Dayprice = dayPrice;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String registration) {
        Registration = registration;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public int getDayPrice() {
        return Dayprice;
    }

    public void setDayPrice(int dayPrice) {
        Dayprice = dayPrice;
    }

    public boolean isActif() {
        return Isactif;
    }

    public void setActif(boolean actif) {
        Isactif = actif;
    }
}