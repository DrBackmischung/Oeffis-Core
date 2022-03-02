package de.mathisneunzig.oeffis.core.entities;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Builder
@Value
public class Station {
	
	UUID id;
	String name;
	Address address;
	int plattformCount;
	boolean wheelchairAccessible;
	
}
