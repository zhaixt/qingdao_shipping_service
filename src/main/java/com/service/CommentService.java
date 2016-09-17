package com.service;


import com.model.Comment;


import java.util.List;

public interface CommentService {
	public List<Comment> findByPostId(Long postId);
	public Integer saveComment(Comment user);//返回个数
}
