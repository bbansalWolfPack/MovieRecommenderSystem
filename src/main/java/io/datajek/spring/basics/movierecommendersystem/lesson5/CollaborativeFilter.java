package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative based filter
        return new String[] {};
    }
}
