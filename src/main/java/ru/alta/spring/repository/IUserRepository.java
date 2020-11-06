package ru.alta.spring.repository;

import ru.alta.spring.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAllUsers();
    void addUser(User user);
    void deleteUser(User user);
    boolean findUserByID(User user);
}
