package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    @Autowired
    @Qualifier("CBF")
    private Filter contentBasedFilter;
    
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + this.contentBasedFilter + "\n");
        return this.contentBasedFilter.getRecommendations(movie);
    }
}
