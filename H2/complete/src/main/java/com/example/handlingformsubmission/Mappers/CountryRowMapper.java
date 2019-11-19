package com.example.handlingformsubmission.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.example.handlingformsubmission.model.Country;

public class CountryRowMapper implements RowMapper<Country>  {
	@Override
	public Country mapRow(ResultSet resultSet, int i) throws SQLException {
		Country country = new Country();
		country.setCountry(resultSet.getString("COUNTRY"));
		country.setCountryIsoCode(resultSet.getString("COUNTRY_ISO_CODE"));
		country.setRegion(resultSet.getString("REGION"));
		return country;
	}
}
