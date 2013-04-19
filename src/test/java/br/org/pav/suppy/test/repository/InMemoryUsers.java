package br.org.pav.suppy.test.repository;

import br.org.pav.suppy.model.User;
import br.org.pav.suppy.repository.Users;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUsers implements Users {

    private final List<User> users = new ArrayList<User>();

    public List<User> findAll() {
        return users;
    }

    public User findOne(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void store(User user) {
        users.add(user);
    }

    @Override
    public void remove(String id) {
        Iterables.removeIf(users, hasIdOf(id));
    }

    private Predicate<User> hasIdOf(final String id) {
        return new Predicate<User>() {
            @Override
            public boolean apply(User user) {
                return user.getId().equals(id);
            }
        };
    }
}