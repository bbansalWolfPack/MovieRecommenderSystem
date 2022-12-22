package io.datajek.spring.basics.movierecommendersystem.setterInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CollaborativeFilter")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative based filter
        return new String[] {};
    }
}
