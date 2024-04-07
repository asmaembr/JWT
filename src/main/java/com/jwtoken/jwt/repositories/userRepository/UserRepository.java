package com.jwtoken.jwt.repositories.userRepository;

import com.jwtoken.jwt.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail (String email );

}
