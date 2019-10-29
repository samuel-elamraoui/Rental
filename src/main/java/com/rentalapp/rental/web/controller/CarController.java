package com.rentalapp.rental.web.controller;

import com.rentalapp.rental.model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CarController {
    RestTemplate restTemplate = new RestTemplate();
    

    @RequestMapping(value = {"listeVoitures"}, method = RequestMethod.GET)
    public Car[] listeVoiture(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Car[] voitures = restTemplate.getForObject("http://172.22.119.164:8081/listeVoitures", Car[].class);
        model.addAttribute("voitures", voitures);
        System.out.println(voitures);
        return voitures;
    }


    @RequestMapping(value = {"/addVoiture"}, method = RequestMethod.POST)
    public void saveVoiture(Model modele, @ModelAttribute("voitureAjout") Car voiture) {


        String registration = voiture.getRegistration();
        String mark = voiture.getMark();
        String model = voiture.getModel();
        String color = voiture.getColor();
        int cv= voiture.getCV();
        int dayprice = voiture.getDayPrice();



        if (mark != null && mark.length() > 0 //
                && model != null && model.length() > 0) {

            Car newVoiture = new Car( registration,mark,model,color,cv,dayprice );
            restTemplate.postForObject("http://172.22.119.164:8081/addVoiture",newVoiture,Car.class);


        } else {

        }


    }
    @RequestMapping(value = {"/deleteVoiture/{id}"}, method = RequestMethod.GET)
    public void deleteVoiture(@PathVariable int id){

        restTemplate.delete("http://172.22.119.164:8081/deleteVoiture/"+id);

    }


}
