package com.service.impl;



import com.model.Post;
import com.repository.PostRepository;
import com.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Post> findPostByPostTime(String postTime) {
		return postRepository.findByPostTime(postTime);
	}
	@Override
	public Integer savePost(Post post){
		try {
			postRepository.save(post);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
