package io.datajek.spring.basics.movierecommendersystem.lesson2;

// using Filter interface helps us to loose couple our classes and their implementations
public interface Filter {
    public String[] 
    getRecommendations(String movie);
}
