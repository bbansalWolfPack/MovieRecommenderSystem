package io.datajek.spring.basics.movierecommendersystem.lesson2;


public class RecommenderImplementation {
    // using filter interface to define filter
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
