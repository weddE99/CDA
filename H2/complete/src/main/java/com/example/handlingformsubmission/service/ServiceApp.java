package com.example.handlingformsubmission.service;

import com.example.handlingformsubmission.Mappers.AirlinesRowMapper;
import com.example.handlingformsubmission.model.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceApp {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public  List<Airline> getAirlines(){

        String sql="select * from AIRLINES";
        List<Airline> query = jdbcTemplate.query(sql, new AirlinesRowMapper());
        query.forEach(item->System.out.println(item.getAirlineNameShort()));
        return query;
    }


}
