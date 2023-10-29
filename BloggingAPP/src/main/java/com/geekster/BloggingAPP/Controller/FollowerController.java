package com.geekster.BloggingAPP.Controller;

import com.geekster.BloggingAPP.Model.Follower;
import com.geekster.BloggingAPP.Service.FollowerService;
import com.geekster.BloggingAPP.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
public class FollowerController {

    @Autowired
    UserService userService;

    @Autowired
    FollowerService followerService;

    @PostMapping("follow/user/{targetUserId}")
    public String followTarget(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue, @PathVariable Integer targetUserId)
    {
        return followerService.followTarget(email,tokenValue,targetUserId);
    }

    @GetMapping("all/follower")
    public List<Follower> getAllFollower(@RequestParam @Valid String email, @RequestParam @Valid String tokenValue){
        return followerService.getAllFollower(email,tokenValue);
    }
}
