package com.example.handlingformsubmission;

import com.example.handlingformsubmission.model.Airline;
import com.example.handlingformsubmission.model.Country;
import com.example.handlingformsubmission.model.Flight;
import com.example.handlingformsubmission.service.ServiceApp;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @Autowired
    ServiceApp serviceApp;
    
    @GetMapping("/airlines")
    public String airlinesForm(Model model) {
        model.addAttribute("airlines", serviceApp.getAirlines().iterator());
        return "airlines";
    }
    
    @GetMapping("/country")
    public String countriesForm(Model model){
    	model.addAttribute("country", new Country());
    	return "countriesForm";
    }

    @GetMapping("/seats")
    public String airlinesSeats(Model model) {
        model.addAttribute("airline", new Airline());
        return "airlineForm";
    }
    
    @GetMapping("/flight")
    public String flightsSeats(Model model) {
        model.addAttribute("flight", new Flight());
        return "flightForm";
    }

    @PostMapping("/seat")
    public String seatSubmit(@ModelAttribute Airline airline) {
        airline.setEconomySeat(serviceApp.getEconomySeatsFromAirlines(airline.getAirlineNameShort(),airline.getAirlineNameLong()));
        airline.setFirstClassSeat(serviceApp.getFirstClassSeatsFromAirlines(airline.getAirlineNameShort(),airline.getAirlineNameLong()));
        //airline.setFirstClassLevelFactor(serviceApp.getFirstClassLevelFromAirlines(airline.getAirlineNameShort(),airline.getAirlineNameLong()));
        return "airlineFormResult";
    }
    
    @PostMapping("/countries")
    public String countriesSubmit(Model model, @ModelAttribute Country country) {
    	model.addAttribute("country", serviceApp.getCountriesByContinents(country.getRegion()).iterator());
    	return "countries";
    }
    
    @PostMapping("/flights")
    public String flightsSubmit(Model model, @ModelAttribute Flight flight, Time desde, Time hasta) {
    	model.addAttribute("flight", serviceApp.getFlight(desde,hasta));
    	return "flights";
    }
}
