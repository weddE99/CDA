package com.example.handlingformsubmission.Mappers;

import com.example.handlingformsubmission.model.Airline;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class AirlinesRowMapper implements RowMapper<Airline> {
    @Override
    public Airline mapRow(ResultSet resultSet, int i) throws SQLException {
        Airline airline = new Airline();
        airline.setAirlineNameShort(resultSet.getString("AIRLINE"));
        airline.setAirlineNameLong(resultSet.getString("AIRLINE_FULL"));
        airline.setBasicRate(resultSet.getDouble("BASIC_RATE"));
        airline.setBusinessLevelFactor(resultSet.getDouble("BUSINESS_LEVEL_FACTOR"));
        airline.setDistanceDiscount(resultSet.getDouble("DISTANCE_DISCOUNT"));
        airline.setEconomySeat(resultSet.getInt("ECONOMY_SEATS"));
        airline.setFirstClassSeat(resultSet.getInt("ECONOMY_SEATS"));
        return  airline;
    }
}
