package de.mathisneunzig.oeffis.core.graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query  implements GraphQLQueryResolver {
	
	public String test() {
		return "Hello GraphQL";
	}
	
}
