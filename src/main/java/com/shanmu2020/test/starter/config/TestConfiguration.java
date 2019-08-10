package com.shanmu2020.test.starter.config;

import com.shanmu2020.test.starter.model.AutoProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    @ConditionalOnMissingBean(AutoProperties.class)
    public AutoProperties helloBean() {
        return new AutoProperties();
    }

}
