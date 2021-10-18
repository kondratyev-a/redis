package com.kondratyev.redis.repositories;

import com.kondratyev.redis.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
