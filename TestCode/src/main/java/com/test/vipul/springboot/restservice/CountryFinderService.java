package com.test.vipul.springboot.restservice;

import java.util.HashMap;
import java.util.Map;

import com.test.vipul.springboot.model.CityCountryMapper;

public class CountryFinderService {

	
	private Map<String,String> cityCountryMap ;
	
	public CountryFinderService(){
		cityCountryMap = new HashMap<>();
		
		cityCountryMap.put("New Delhi", "India");
		cityCountryMap.put("New York", "USA");
		cityCountryMap.put("London", "England");
	
	}
	
	public CityCountryMapper getCountryNameFromCity(String cityName){
		CityCountryMapper cityCountryMapper = null ;
		if(cityCountryMap.containsKey(cityName)){
			cityCountryMapper = new CityCountryMapper(cityName, cityCountryMap.get(cityName));
		}else{
			System.out.println(" city name provided is not capitol of any country ");
			cityCountryMapper = new CityCountryMapper(cityName, "No Counrty Found");
		}
		return cityCountryMapper;
	}
	
	public void addCaptialAndCountry(CityCountryMapper cityCountry){
		cityCountryMap.put(cityCountry.getCityName(),cityCountry.getCountryName());
	}
	
	public boolean updateCaptialAndCountry(CityCountryMapper cityCountry){
		boolean success = true;
		if(!cityCountryMap.containsKey(cityCountry.getCityName())){
			return false;
		}
		
		cityCountryMap.put(cityCountry.getCityName(),cityCountry.getCountryName());
		return success;
	}
	
	
	public boolean deleteCapitalCountryRecord(String cityName){
		
		boolean success = true;
		
		if(!cityCountryMap.containsKey(cityName)){
			return !success;
		}
		
		cityCountryMap.remove(cityName);
		return success;
	}
	
}
