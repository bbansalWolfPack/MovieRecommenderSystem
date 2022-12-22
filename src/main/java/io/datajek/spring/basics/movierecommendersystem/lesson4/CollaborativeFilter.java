package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

// using primary annotation we are telling spring which bean takes precendenceclear
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative based filter
        return new String[] {};
    }
}
