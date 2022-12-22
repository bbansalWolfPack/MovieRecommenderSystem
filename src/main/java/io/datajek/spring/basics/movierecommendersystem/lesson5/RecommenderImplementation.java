package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    @Autowired
    private Filter contentBasedFilter;
    
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + this.contentBasedFilter + "\n");
        return this.contentBasedFilter.getRecommendations(movie);
    }
}
