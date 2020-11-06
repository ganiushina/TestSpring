package ru.alta.spring.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.alta.spring.User;
import ru.alta.spring.repository.IUserRepository;

import java.util.List;

@Component
public class UserService {
    private IUserRepository userRepository;

    @Autowired
    public void setUserService(@Qualifier(value = "userRepository") IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printAllUsers() {
        List<User> users = userRepository.findAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }
}