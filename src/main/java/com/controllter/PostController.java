package com.controllter;


import com.model.Post;
import com.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {
	@Autowired
    private PostService postService;

    @RequestMapping("/postTime/{postTime}")
    List<Post> findById(@PathVariable String postTime) {
        return postService.findPostByPostTime(postTime);
    }
    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
    Integer saveUser(@RequestBody final Post post) {
      return postService.savePost(post);
    }
}
