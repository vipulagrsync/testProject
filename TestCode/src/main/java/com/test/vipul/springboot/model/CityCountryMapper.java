package com.test.vipul.springboot.model;

public class CityCountryMapper {

	
	private final String cityName ;
	
	private final String countryName ;
	
	public CityCountryMapper(String _cityName , String _countryName){
		this.cityName = _cityName ;
		this.countryName = _countryName ;
	}
	

	public String getCityName() {
		return cityName;
	}

	public String getCountryName() {
		return countryName;
	}
	
	
}
