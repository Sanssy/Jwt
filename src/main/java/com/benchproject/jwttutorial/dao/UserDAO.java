package com.benchproject.jwttutorial.dao;

import com.benchproject.jwttutorial.model.DAOUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);
}
