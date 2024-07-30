package com.assignment111.assignment111.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.assignment111.assignment111.Entity.Post;
import com.assignment111.assignment111.Service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PostController {
    
    @Autowired
    private PostService pService;

    @GetMapping("/post/{title}")
    public Post getByTitle(@PathVariable String title) {
        return pService.getByTitle(title);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return post;
    }


    
    
}
