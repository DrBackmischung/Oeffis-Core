package de.mathisneunzig.oeffis.core.graphql;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	public String version() {
		return "0.0.1";
	}
	
}
