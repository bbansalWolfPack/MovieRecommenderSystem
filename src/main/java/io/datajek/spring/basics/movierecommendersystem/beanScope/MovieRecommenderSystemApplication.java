package io.datajek.spring.basics.movierecommendersystem.beanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication.class, args);

		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);

		ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);

		System.out.println(cbf2);

		System.out.println(cbf3);

		// prototype scope for collaborative filter

		CollaborativeFilter collabFil1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter collabFil2 = appContext.getBean(CollaborativeFilter.class);

		System.out.println(collabFil1);

		System.out.println(collabFil2);
	}

}
