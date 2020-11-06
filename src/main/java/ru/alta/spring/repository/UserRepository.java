package ru.alta.spring.repository;

import org.springframework.stereotype.Component;
import ru.alta.spring.User;
import ru.alta.spring.UserContact;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class UserRepository implements IUserRepository {

    private List<User> users;
    private List<UserContact> usersContact;

    @PostConstruct
    public void init() {
        this.users = new ArrayList<>();
        this.usersContact = new ArrayList<>();
        this.usersContact.add(new UserContact("888", "bob@gmail.com"));
        this.usersContact.add(new UserContact("999", "john@gmail.com"));
        this.users.add(new User(2L, "Bob",  usersContact.get(0)));
        this.users.add(new User(3L, "John", usersContact.get(1)));
    }

    public List<User> findAllUsers() {
        return Collections.unmodifiableList(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);

    }

    public boolean findUserByID(User user) {
       return users.indexOf(user.getId()) > 0;
    }
}
