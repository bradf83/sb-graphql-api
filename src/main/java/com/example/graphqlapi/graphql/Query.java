package com.example.graphqlapi.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlapi.model.Movie;
import com.example.graphqlapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final MovieRepository movieRepository;

    public List<Movie> movies(){
        return this.movieRepository.findAllBy();
    }
}
