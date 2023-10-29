package com.geekster.BloggingAPP.Repo;

import com.geekster.BloggingAPP.Model.Comment;
import com.geekster.BloggingAPP.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

    List<Comment> findByPostOwner(Post myPost);

    Comment findFirstByPostOwner(Post post);
}
