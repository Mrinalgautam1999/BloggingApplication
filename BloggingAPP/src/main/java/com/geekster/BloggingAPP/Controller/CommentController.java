package com.geekster.BloggingAPP.Controller;

import com.geekster.BloggingAPP.Model.Comment;
import com.geekster.BloggingAPP.Model.DTO.UserDto;
import com.geekster.BloggingAPP.Service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("comment/post/{postId}")
    public String addComment(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue, @PathVariable Integer postId, @RequestBody String commentBody )
    {
        return commentService.addComment(email,tokenValue,commentBody,postId);
    }

    @DeleteMapping("post/comment/{commentId}")
    public String removeComment(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue,
                                @PathVariable Integer commentId)
    {
        return commentService.removeComment(email,tokenValue,commentId);
    }

    @GetMapping("all/comment/{postId}")
    public List<Comment> getCommentByPostId(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue,
                                            @PathVariable Integer postId){
        return commentService.getCommentByPostId(email,tokenValue,postId);
    }

    @PutMapping("update/comment/{CommentId}")
    public String updateCommentByPostId(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue,
                                            @PathVariable Integer CommentId, @RequestBody Comment newComment){
        return commentService.updateCommentByPostId(email,tokenValue,CommentId, newComment);
    }
}
