package org.example.blogbackend.repositories;

import org.example.blogbackend.entities.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
}
