package ru.netology.RestAuthorization.service.repository;

import org.springframework.stereotype.Repository;
import ru.netology.RestAuthorization.service.model.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
        User user1 = new User("user1", "password1");
        user1.addAuthority(Authorities.READ);
        user1.addAuthority(Authorities.WRITE);

        User user2 = new User("user2", "password2");
        user2.addAuthority(Authorities.READ);

        users.add(user1);
        users.add(user2);
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User u : users) {
            if (u.getUsername().equals(user) && u.getPassword().equals(password)) {
                return u.getAuthorities();
            }
        }
        return List.of();
    }
}