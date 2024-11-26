package com.stark.controller;

import com.stark.entity.Post;
import com.stark.repository.CommentRepository;
import com.stark.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/postx")
public class PostController {

    private PostRepository postRepository;


    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping
    public String createPost(
        @RequestBody Post post
    ) {
        postRepository.save(post);
        return "Post created successfully";
    }
    @DeleteMapping
    public void deletePost(){
        postRepository.deleteById(1L);
    }
}
