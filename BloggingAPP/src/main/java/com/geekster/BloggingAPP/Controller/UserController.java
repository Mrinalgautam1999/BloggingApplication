package com.geekster.BloggingAPP.Controller;


import com.geekster.BloggingAPP.Model.DTO.SignInDto;
import com.geekster.BloggingAPP.Model.DTO.UserSignInDTO;
import com.geekster.BloggingAPP.Model.Post;
import com.geekster.BloggingAPP.Model.User;
import com.geekster.BloggingAPP.Service.Password;
import com.geekster.BloggingAPP.Service.PostService;
import com.geekster.BloggingAPP.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody @Valid UserSignInDTO userSignInDTO){
        return userService.userSignUp(userSignInDTO);
    }

    @PostMapping("User/signIn")
    public String userSignIn(@RequestBody SignInDto signInDto){
        return userService.userSignIn(signInDto);
    }

    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestParam @Valid String email, @RequestParam String token)
    {
        return userService.userSignOut(email,token);
    }

    @GetMapping("postById/{postId}")
    public Post getPostById(@RequestParam @Valid String email, @RequestParam @Valid String token, @PathVariable Integer postId)
    {
        return userService.getPostById(email, token, postId);
    }
    @PutMapping("change/password")
    public String changePassword(@RequestParam @Valid String email, @RequestParam @Valid String token, @RequestBody Password password){
        return userService.changePassword(email, token, password);
    }
}
