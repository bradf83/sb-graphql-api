package com.example.graphqlapi.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphqlapi.model.Movie;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MovieResolver implements GraphQLResolver<Movie> {
    public String getCustomDescription(Movie movie){
        return "A Custom Field: " + movie.getDescription();
    }

    public List<String> getStringList(Movie movie) {
        return Arrays.asList("Hello", "World");
    }
}
