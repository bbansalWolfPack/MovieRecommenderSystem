package io.datajek.spring.basics.movierecommendersystem.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");  
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In content based filter preDestroy method");
    }
}
