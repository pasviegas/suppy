package br.org.pav.suppy.repository;

import br.org.pav.suppy.model.User;

import java.util.List;

public interface Users {

    List<User> findAll();

    User findOne(String id);

    void store(User user);

    void remove(String id);

}