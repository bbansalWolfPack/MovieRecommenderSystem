package io.datajek.spring.basics.movierecommendersystem.lesson2;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ContentBasedFilter cbFilter = new ContentBasedFilter();

		RecommenderImplementation recommendedImplementation = new RecommenderImplementation(cbFilter);
		String[] recommendedMovies = recommendedImplementation.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(recommendedMovies));
	}

}
