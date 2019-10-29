package com.rentalapp.rental.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
    private int id;
    private Date startrental;
    private Date endrental;
    private int rentalfee;

    public Booking(Date startrental, Date endrental, int rentalfee) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartrental() {
        return startrental;
    }

    public void setStartrental(Date startrental) {
        this.startrental = startrental;
    }

    public Date getEndrental() {
        return endrental;
    }

    public void setEndrental(Date endrental) {
        this.endrental = endrental;
    }

    public int getRentalfee() {
        return rentalfee;
    }

    public void setRentalfee(int rentalfee) {
        this.rentalfee = rentalfee;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", startrental=" + startrental +
                ", endrental=" + endrental +
                ", rentalfee=" + rentalfee +
                '}';
    }
}
