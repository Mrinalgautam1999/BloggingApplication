package com.geekster.BloggingAPP.Repo;

import com.geekster.BloggingAPP.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
