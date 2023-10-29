package com.geekster.BloggingAPP.Repo;

import com.geekster.BloggingAPP.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findFirstByUserEmail(String existingEmail);
}
