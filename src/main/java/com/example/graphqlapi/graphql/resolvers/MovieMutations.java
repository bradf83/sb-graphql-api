package com.example.graphqlapi.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqlapi.model.Movie;
import com.example.graphqlapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieMutations implements GraphQLMutationResolver {
    private final MovieRepository movieRepository;

    /**
     * The following is the body required to call this mutation in Postman
     *
     * {"query": "mutation {writeMovie(name:\"SomeMovie\", description:\"SomeDesc\", releaseYear:10, discFormat:\"AA\", bestSoundFormat:\"AA\", ultraHdFormat:\"BB\"){name}} "}
     *
     * Explanation
     * All GraphQL operations seems to need "query"
     * Next is the payload which is a mutation
     * The mutation we want to call is writeMovie
     * In between ( and ) are the variables to call that mutation
     * In between the { and } that follow is the query of the data we want to return.  This mutation returns a Movie so we can ask for anything that is available from Movie in GraphQL
     * So basically {"query": "mutation {mutationName(mutationVariables){response}}"}
     */

    public Movie writeMovie(String name, String description, int releaseYear, String discFormat, String bestSoundFormat, String ultraHdFormat){
        //TODO: Bean mapping?
        Movie movie = new Movie();
        movie.setName(name);
        movie.setDescription(description);
        movie.setReleaseYear(releaseYear);
        movie.setDiscFormat(discFormat);
        movie.setBestSoundFormat(bestSoundFormat);
        movie.setUltraHdFormat(ultraHdFormat);

        return this.movieRepository.save(movie);
    }
}
