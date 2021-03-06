package com.unal.skyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/*@EnableMongoRepositories(basePackageClasses = UserRepository.class)

 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SkywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywayApplication.class, args);

    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

}
