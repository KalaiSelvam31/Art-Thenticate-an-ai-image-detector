package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class Bcrypt {
    BCryptPasswordEncoder encoders = new BCryptPasswordEncoder(10);

    @Bean
    public BCryptPasswordEncoder getEncoder() {

        return encoders;
    }


}
