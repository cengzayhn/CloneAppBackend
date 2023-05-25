package com.cengzayhn.cloneapp.Controller;

import com.cengzayhn.cloneapp.Entity.Post;
import com.cengzayhn.cloneapp.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {

    private final PostService postService;
    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post){
        return postService.submitPostToDb(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPost(){
        return postService.retrievePostFromDb();
    }
}
