package com.controllter;


import com.model.Comment;
import com.model.Post;
import com.service.CommentService;
import com.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
	@Autowired
    private CommentService commentService;

    @RequestMapping("/postId/{postId}")
    List<Comment> findById(@PathVariable Long postId) {
        return commentService.findByPostId(postId);
    }
    @RequestMapping(value = "/saveComment", method = RequestMethod.POST)
    Integer saveComment(@RequestBody final Comment comment) {
      return commentService.saveComment(comment);
    }
}
