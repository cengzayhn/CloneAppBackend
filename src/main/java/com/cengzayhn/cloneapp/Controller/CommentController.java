package com.cengzayhn.cloneapp.Controller;

import com.cengzayhn.cloneapp.Entity.Comments;
import com.cengzayhn.cloneapp.Service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {
    private final CommentService commentService;

    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comments){
         return commentService.submitCommenttoDb(comments);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
        return commentService.getAllCommentsForDb(postId);
    }
}
