package com.repository;

import com.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByPostTime(String postTime);
    Post save(Post post);
}
