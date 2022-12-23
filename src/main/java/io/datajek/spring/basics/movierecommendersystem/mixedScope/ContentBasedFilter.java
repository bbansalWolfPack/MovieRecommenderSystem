package io.datajek.spring.basics.movierecommendersystem.mixedScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    private static int instances = 0;

    private Movie movie;

    @Autowired
    public ContentBasedFilter(Movie movie) {
        instances++;
        this.movie = movie;
        
        System.out.println("Content based filter constructor called");
    }

    @Override
    public String[] getRecommendations(String movie) {
        // logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
    
}
