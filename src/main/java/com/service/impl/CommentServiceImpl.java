package com.service.impl;




import com.model.Comment;
import com.repository.CommentRepository;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public List<Comment> findByPostId(Long postId) {
		return commentRepository.findByPostId(postId);
	}
	@Override
	public Integer saveComment(Comment comment){
		try {
			commentRepository.save(comment);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
