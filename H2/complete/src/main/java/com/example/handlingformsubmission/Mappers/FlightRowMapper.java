package com.example.handlingformsubmission.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.handlingformsubmission.model.Flight;

public class FlightRowMapper implements RowMapper<Flight> {
	@Override
	public Flight mapRow(ResultSet resultSet, int i) throws SQLException {
		Flight flight = new Flight();
		flight.setFlightId(resultSet.getString("FLIGHT_ID"));
		flight.setSegmentNumber(resultSet.getInt("SEGMENT_NUMBER"));
		flight.setOrigAirport(resultSet.getString("ORIG_AIRPORT"));
		flight.setDepartTime(resultSet.getTime("DEPART_TIME"));
		flight.setDestAirport(resultSet.getString("DEST_AIRPORT"));
		flight.setArriveTime(resultSet.getTime("ARRIVE_TIME"));
		flight.setMeal(resultSet.getString("MEAL"));
		flight.setFlyingTime(resultSet.getDouble("FLYING_TIME"));
		flight.setMiles(resultSet.getInt("MILES"));
		flight.setAircraft(resultSet.getString("AIRCRAFT"));
		
		return flight;
	}
}
