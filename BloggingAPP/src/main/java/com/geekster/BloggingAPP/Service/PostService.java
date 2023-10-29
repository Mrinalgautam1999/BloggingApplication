package com.geekster.BloggingAPP.Service;


import com.geekster.BloggingAPP.Model.Comment;
import com.geekster.BloggingAPP.Model.Post;
import com.geekster.BloggingAPP.Model.User;
import com.geekster.BloggingAPP.Repo.CommentRepo;
import com.geekster.BloggingAPP.Repo.PostRepo;
import com.geekster.BloggingAPP.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    CommentRepo commentRepo;
    public void createPost(Post post) {
        postRepo.save(post);
    }

    public Post findPost(Integer postId) {
      return postRepo.findById(postId).orElseThrow();

    }
    public String deletePost(String email, String tokenValue, Integer postId) {
        if(authenticationService.authenticate(email, tokenValue)){
            Post post = postRepo.findById(postId).orElseThrow();
            String postUserEmail = post.getPostUser().getUserEmail();



            if(email.equals(postUserEmail)){
                List<Comment> comment = commentRepo.findByPostOwner(post);
                if(comment != null){
                    commentRepo.deleteAll(comment);
                }
                postRepo.delete(post);
                return "post deleted";
            }else{
                return "Invalid User";
            }

        }else {
            return "Un Authenticated access!!!";
        }
    }
    public void delete(Post post) {
        postRepo.delete(post);
    }

}
