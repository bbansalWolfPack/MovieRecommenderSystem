package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    @Autowired
    private Filter filter;
    
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + this.filter + "\n");
        return this.filter.getRecommendations(movie);
    }
}
