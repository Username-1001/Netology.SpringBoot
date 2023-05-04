package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.Authorities;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private ConcurrentHashMap<User, List<Authorities>> repository = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(User user) {
        return repository.getOrDefault(user, Collections.emptyList());
    }
}