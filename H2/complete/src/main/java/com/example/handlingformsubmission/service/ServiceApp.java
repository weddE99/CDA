package com.example.handlingformsubmission.service;

import com.example.handlingformsubmission.Mappers.AirlinesRowMapper;
import com.example.handlingformsubmission.Mappers.CountryRowMapper;
import com.example.handlingformsubmission.Mappers.FlightRowMapper;
import com.example.handlingformsubmission.model.Airline;
import com.example.handlingformsubmission.model.Country;
import com.example.handlingformsubmission.model.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;

@Service
public class ServiceApp {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     *
     * @return
     */
    public List<Airline> getAirlines(){
        String sql = "select * from AIRLINES";
        List<Airline> query = jdbcTemplate.query(sql, new AirlinesRowMapper());
        //query.forEach(item->System.out.println(item.getAirlineNameShort()));
        return query;
    }
    
    /**
    *
    * @return
    */
   public List<Country> getCountriesByContinents(String region){
       String query = "SELECT * FROM COUNTRIES WHERE REGION = ? ORDER BY REGION ASC";
       List<Country> country = jdbcTemplate.query(query,new Object[]{region},new CountryRowMapper());
       //country.forEach(item->System.out.println(item.getCountry()));
       return country;
   }

   /**
   *
   * @return
   */
  public List<Flight> getFlight(Time desde, Time hasta){
      String query = "SELECT * FROM FLIGHTS WHERE ARRIVE_TIME BETWEEN ? AND ? ORDER BY ARRIVE_TIME ASC";
      List<Flight> flight = jdbcTemplate.query(query,new Object[]{desde,hasta},new FlightRowMapper());
      //flight.forEach(item->System.out.println(item.getFlightId()));
      return flight;
  }
    /**
     *
     * @param shortName
     * @param longName
     * @return
     */
    public Integer getEconomySeatsFromAirlines(String shortName, String longName){
    	String query = "SELECT * FROM AIRLINES WHERE AIRLINE = ? AND AIRLINE_FULL = ?;";
        List<Airline> airline = jdbcTemplate.query(query,new Object[]{shortName,longName},new AirlinesRowMapper());
        if(!airline.isEmpty()){
            Airline a = airline.get(0);
            return a.getEconomySeat();
        }
        return 0;
    }
    
    /**
    *
    * @param shortName
    * @param longName
    * @return
    */
   public Integer getFirstClassSeatsFromAirlines(String shortName, String longName){
       String query = "SELECT * FROM AIRLINES WHERE AIRLINE = ? AND AIRLINE_FULL = ?;";
       List<Airline> airline = jdbcTemplate.query(query,new Object[]{shortName,longName},new AirlinesRowMapper());
       if(!airline.isEmpty()){
           Airline a= airline.get(0);
           return a.getFirstClassSeat();
       }
       return 0;
   }
   
   /**
   *
   * @param shortName
   * @param longName
   * @return
   */
  public Double getFirstClassLevelFromAirlines(String shortName, String longName){
      String query = "SELECT * FROM AIRLINES WHERE AIRLINE = ? AND AIRLINE_FULL = ?;";
      List<Airline> airline = jdbcTemplate.query(query,new Object[]{shortName,longName},new AirlinesRowMapper());
      if(!airline.isEmpty()){
          Airline a = airline.get(0);
          return a.getFirstClassLevelFactor();
      }
      return 0.0;
  }
}
