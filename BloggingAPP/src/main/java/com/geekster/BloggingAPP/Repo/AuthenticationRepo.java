package com.geekster.BloggingAPP.Repo;

import com.geekster.BloggingAPP.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepo extends JpaRepository<AuthenticationToken, Integer> {


    AuthenticationToken findFirstByTokenValue(String token);
}
