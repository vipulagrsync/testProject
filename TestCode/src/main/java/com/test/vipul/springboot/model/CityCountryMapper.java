package com.test.vipul.springboot.model;

public class CityCountryMapper {

	
	private String cityName ;
	
	private  String countryName ;
	
	public CityCountryMapper(){
	}
	
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
	
	
	public void setCityName(String _cityName){
		this.cityName = _cityName;
		
	}
	
	public void setCountryName(String _countryName){
		this.countryName = _countryName ;
	}
	
}
