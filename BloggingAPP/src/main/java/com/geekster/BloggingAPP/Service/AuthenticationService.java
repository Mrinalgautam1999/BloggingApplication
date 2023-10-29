package com.geekster.BloggingAPP.Service;

import com.geekster.BloggingAPP.Model.AuthenticationToken;
import com.geekster.BloggingAPP.Model.Comment;
import com.geekster.BloggingAPP.Model.Post;
import com.geekster.BloggingAPP.Model.User;
import com.geekster.BloggingAPP.Repo.AuthenticationRepo;
import com.geekster.BloggingAPP.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    AuthenticationRepo authenticationRepo;

    @Autowired
    UserRepo userRepo;
    public void createToken(AuthenticationToken token) {
        authenticationRepo.save(token);
    }

    public boolean authenticate(String email, String token) {

        AuthenticationToken tokenValue = authenticationRepo.findFirstByTokenValue(token);
        if(tokenValue != null){
            return tokenValue.getUser().getUserEmail().equals(email);
        }else{
            return false;
        }
    }

    public void deleteToken(String token) {
        AuthenticationToken token1 = authenticationRepo.findFirstByTokenValue(token);
        authenticationRepo.delete(token1);
    }

    public boolean authorizedCommentRemover(String email, Post post, Comment commentToBeDeleted) {
        User authUser = userRepo.findFirstByUserEmail(email);

        return authUser.equals(post.getPostUser()) || authUser.equals(commentToBeDeleted.getCommenter());
    }
}
