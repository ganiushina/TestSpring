package ru.alta.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alta.spring.config.AppConfig;
import ru.alta.spring.servis.UserService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        //   user.setUsername("John");
        System.out.println(user.toString());

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        UserService userService = context.getBean("userService", UserService.class);
        userService.printAllUsers();

    }
}
