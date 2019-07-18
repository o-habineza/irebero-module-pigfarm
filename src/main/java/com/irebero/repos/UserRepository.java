package com.irebero.repos;

import org.springframework.data.repository.CrudRepository;
import com.irebero.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);

}
