package de.mathisneunzig.oeffis.core.graphql;

import java.util.UUID;

import org.springframework.stereotype.Component;

import de.mathisneunzig.oeffis.core.entities.Address;
import de.mathisneunzig.oeffis.core.entities.Station;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class StationResolver implements GraphQLQueryResolver {
	
	public Station station(UUID id) {
		
		return Station.builder()
				.id(id)
				.name("Parkring")
				.address(Address.builder()
						.id(id)
						.street("Parkring")
						.number("21")
						.zipcode(68159)
						.city("Mannheim")
						.build())
				.plattformCount(4)
				.wheelchairAccessible(true)
				.build();
		
	}
	
}
