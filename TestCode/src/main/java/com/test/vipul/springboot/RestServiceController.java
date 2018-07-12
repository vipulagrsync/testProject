package com.test.vipul.springboot;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.vipul.springboot.model.CityCountryMapper;
import com.test.vipul.springboot.restservice.CountryFinderService;

@RestController
public class RestServiceController {

	private CountryFinderService countryService ;
	
	public RestServiceController(){
		countryService = new CountryFinderService();
	}
	@RequestMapping(path = "/getCountryOfCapital" ,  method = RequestMethod.GET)
	public CityCountryMapper getCountryForCapitol(@RequestParam(value="cityName")String cityName){
		
		return countryService.getCountryNameFromCity(cityName);
		//172.20.220.128
	}
	
	@PostMapping(path = "/addCapitalCountry")
    public ResponseEntity<?> addCapitalCountry(@RequestBody CityCountryMapper cityCountry) {

        System.out.println(" city to add " + cityCountry.getCityName() + " with country " + cityCountry.getCountryName());

        //validate login here
        countryService.addCaptialAndCountry(cityCountry);
        return new ResponseEntity<Object>("City and Country Added", new HttpHeaders(), HttpStatus.OK);

    }
	
	@PostMapping(path = "/updateCapitalCountry")
    public ResponseEntity<?> updateCapitolCountry(@RequestBody CityCountryMapper cityCountry) {

        System.out.println(" city to add " + cityCountry.getCityName() + " with country " + cityCountry.getCountryName());

        //validate login here
        boolean success = countryService.updateCaptialAndCountry(cityCountry);
        
        ResponseEntity<Object> responseObject = null;
		if(success){
		responseObject = new ResponseEntity<Object>("City and Country Record Updated ", new HttpHeaders(), HttpStatus.OK);
		}else{
			responseObject = new ResponseEntity<Object>("City and Country could not be updated as It didnt exist", new HttpHeaders(), HttpStatus.OK);
		}
		return responseObject;		

    }
	
	
	@RequestMapping(path = "/deleteCapitalCountry" ,  method = RequestMethod.POST)
	public ResponseEntity<?> deleteCapitalCountryRecord(@RequestParam(value="cityName")String cityName){
		
		boolean success = countryService.deleteCapitalCountryRecord(cityName);
		
		ResponseEntity<Object> responseObject = null;
		if(success){
		responseObject = new ResponseEntity<Object>("City and Country Record Deleted", new HttpHeaders(), HttpStatus.OK);
		}else{
			responseObject = new ResponseEntity<Object>("City and Country Not deleted as It didnt exist", new HttpHeaders(), HttpStatus.OK);
		}
		
		return responseObject;		
	}
	
}
