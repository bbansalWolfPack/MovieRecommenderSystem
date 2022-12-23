package io.datajek.spring.basics.movierecommendersystem.mixedScope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie constructor called");
    }

    public static int getInstancesCount() {
        return Movie.instances;
    }
}