package io.datajek.spring.basics.movierecommendersystem.lesson6;

// using Filter interface helps us to loose couple our classes and their implementations
public interface Filter {
    public String[] 
    getRecommendations(String movie);
}
