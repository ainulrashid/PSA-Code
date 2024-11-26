package com.stark.controller;

import com.stark.entity.Comment;
import com.stark.entity.Post;
import com.stark.repository.CommentRepository;
import com.stark.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private PostRepository postRepository;
    private CommentRepository commentRepository;


    public CommentController(PostRepository postRepository,CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }
    @PostMapping
    public String createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
            ){

        Post post = postRepository.findById(postId).get();
        comment.setPost(post);

        commentRepository.save(comment);

        return "Comment created successfully";

    }

}
