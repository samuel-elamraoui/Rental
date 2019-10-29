package com.rentalapp.rental.web.controller;

import com.rentalapp.rental.model.Booking;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class BookingController {
    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/Bookings", method = RequestMethod.GET)
    public String bookingList() {
        restTemplate.getForObject("http://172.22.119.143:8082/Bookings", Booking[].class);
        return "Bookings";
    }

    @RequestMapping(value = "/Bookings/{id}", method = RequestMethod.GET)
    public String showBooking(@PathVariable int id) {
        restTemplate.getForObject(("http://172.22.119.143:8082/Bookings/"+id), Booking[].class);
        return "Booking/{id}";
    }

    @RequestMapping(value = {"/addBooking"}, method = RequestMethod.POST)
    public String addBooking(@RequestBody Booking booking) {

        restTemplate.postForObject("http://172.22.119.143:8082/Bookings",booking,Booking[].class);
        return "addBooking";
    }

    @RequestMapping(value = {"/addBooking"}, method = RequestMethod.PUT)
    public String updateBooking(@RequestBody Booking booking) {

        restTemplate.postForObject("http://172.22.119.143:8082/Bookings", booking,Booking[].class);
        return "addBooking";
    }

    @RequestMapping(value = {"/deleteBooking/{id}"}, method = RequestMethod.GET)
    public String deleteCar(@PathVariable int id){
        restTemplate.delete("http://172.22.119.143:8082/Bookings"+id);
        return "redirect:/Bookings";
    }


}
