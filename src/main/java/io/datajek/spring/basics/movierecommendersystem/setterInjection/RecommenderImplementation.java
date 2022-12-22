package io.datajek.spring.basics.movierecommendersystem.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    private Filter filter;
    
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + this.filter + "\n");
        return this.filter.getRecommendations(movie);
    }

    @Autowired
    public void setFilter(@Qualifier("CollaborativeFilter") Filter filter) {
        this.filter = filter;
    }
}
