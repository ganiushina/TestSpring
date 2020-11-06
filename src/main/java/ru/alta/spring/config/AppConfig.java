package ru.alta.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.alta.spring.User;
import ru.alta.spring.UserContact;


@Configuration
@ComponentScan(basePackages = {"ru.alta.spring"})
public class AppConfig {

    @Bean
    public UserContact userContact(){
        return new UserContact("123", "123@456");
    }
    @Bean
    public User user(){
        return new User((long) 1, "Tom", userContact());
    }
}
