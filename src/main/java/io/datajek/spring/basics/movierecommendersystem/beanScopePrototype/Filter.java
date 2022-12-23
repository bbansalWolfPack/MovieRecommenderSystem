package io.datajek.spring.basics.movierecommendersystem.beanScopePrototype;


public interface Filter {
	public String[] getRecommendations(String movie);
}