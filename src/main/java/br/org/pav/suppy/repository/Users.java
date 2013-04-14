package br.org.pav.suppy.repository;

import java.util.List;

import br.org.pav.suppy.model.User;

public interface Users {

	List<User> findAll();

	User findOne(String id);

	void store(User user);

	void remove(String id);

}