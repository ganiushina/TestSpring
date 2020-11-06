package ru.alta.spring;

public class User {
    private Long id;
    private String username;
 //   private String email;

    UserContact userContact;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(Long id, String username, UserContact userContact) {
        this.id = id;
        this.username = username;
        this.userContact = userContact;
    }

    @Override
    public String toString() {
        return String.format("spring.ru.alta.spring.User [ id: %d, username: %s, email: %s ]", id, username, userContact.getEmail());
    }
}
