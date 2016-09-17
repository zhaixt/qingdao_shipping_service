package com.service;


import com.model.Post;

import java.util.List;

public interface PostService {
	public List<Post> findPostByPostTime(String postTime);
	public Integer savePost(Post post);//返回个数
}
