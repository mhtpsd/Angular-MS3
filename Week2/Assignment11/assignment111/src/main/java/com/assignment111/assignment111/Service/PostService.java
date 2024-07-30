package com.assignment111.assignment111.Service;

import java.util.HashMap;
import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment111.assignment111.Entity.Post;

@Service
public class PostService {
    
    Map<String, Post> postMap = new HashMap<String, Post>();

    // @Autowired
    // private Post post;

    public void addPost (Post post) {
        postMap.put(post.getPostTitle(), post);
    }

    public Post getByTitle (String title) {
     return postMap.get(title);
    }
}
