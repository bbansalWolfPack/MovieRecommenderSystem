package io.datajek.spring.basics.movierecommendersystem.lesson1;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommendedImplementation = new RecommenderImplementation();
		String[] recommendedMovies = recommendedImplementation.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(recommendedMovies));
	}

}
