package me.gicheol.swaggerexam.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi swagger() {
        return GroupedOpenApi.builder()
                .group("spring-doc-exam")
                .pathsToMatch("/**")
                .build();
    }

}
