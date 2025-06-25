package com.kafka.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleContoller {
		
	@PostMapping(path = "/welcome",produces = "applcation/json" ,consumes = "applcation/json")
	public String getWelcome(@RequestBody String name,@RequestHeader(required = true) String value) {
		
		
		
		return "Hello";
		
	}
	public static void main(String[] args) {
	
		List<Integer> n =  Arrays.asList(100,25,3,4,5,7,23);
		
		List<Integer> n5 = new ArrayList<>(n);
		
		 Collections.sort(n5,Collections.reverseOrder());
		
		List<Integer>  n1= n.stream().sorted().collect(Collectors.toList());
		System.out.println("afterList.."+n);
		Integer [] n2 = {7,5,90,2,40,23,100} ;
		
		Arrays.sort(n2,Collections.reverseOrder());
		
		
		
		
	}
	

}
