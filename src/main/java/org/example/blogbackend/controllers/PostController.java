package org.example.blogbackend.controllers;

import lombok.RequiredArgsConstructor;
import org.example.blogbackend.entities.Post;
import org.example.blogbackend.repositories.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
@RequiredArgsConstructor
public class PostController {

    final PostRepository postRepository;

    @GetMapping("")
    public Iterable<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
