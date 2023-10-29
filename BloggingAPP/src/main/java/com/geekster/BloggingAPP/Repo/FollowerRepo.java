package com.geekster.BloggingAPP.Repo;

import com.geekster.BloggingAPP.Model.Follower;
import com.geekster.BloggingAPP.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowerRepo extends JpaRepository<Follower,Integer> {

    List<Follower> findByUserAndFollowers(User follower, User target);

//    List<Follower> findByFollowers(User follow);

    List<Follower> findByUser(User follow);
}
