package de.mathisneunzig.oeffis.core.entities;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Address {
	
	UUID id;
	String street;
	String number;
	int zipcode;
	String city;
	
}
