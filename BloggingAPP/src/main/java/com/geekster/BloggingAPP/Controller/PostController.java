package com.geekster.BloggingAPP.Controller;

import com.geekster.BloggingAPP.Model.Post;
import com.geekster.BloggingAPP.Service.PostService;
import com.geekster.BloggingAPP.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @PostMapping("Post/vlog")
    public String createPost(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue, @RequestBody Post post)
    {
        return userService.createPost(email,tokenValue,post);
    }

    @GetMapping("All/Post")
    public List<Post> getAllPost(){
        return userService.getAllPost();
    }

    @PutMapping("update/Post/{postId}")
    public String updatePost(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue,
                             @PathVariable Integer postId, @RequestBody Post post)
    {
        return userService.updatePost(email,tokenValue,postId,post);
    }

    @DeleteMapping("Post/{postId}")
    public String deletePost(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue, @PathVariable Integer postId)
    {
        return postService.deletePost(email,tokenValue,postId);
    }


}
