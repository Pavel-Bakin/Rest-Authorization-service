package ru.netology.RestAuthorization.service.repository;

import lombok.Getter;
import ru.netology.RestAuthorization.service.model.Authorities;

import java.util.ArrayList;
import java.util.List;

public class User {
    @Getter
    private final String username;
    @Getter
    private final String password;
    private final List<Authorities> authorities;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.authorities = new ArrayList<>();
    }

    public List<Authorities> getAuthorities() {
        return new ArrayList<>(authorities);
    }

    public void addAuthority(Authorities authority) {
        authorities.add(authority);
    }
}