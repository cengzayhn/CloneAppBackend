package com.cengzayhn.cloneapp.Service;

import com.cengzayhn.cloneapp.Entity.Post;
import com.cengzayhn.cloneapp.Entity.Story;
import com.cengzayhn.cloneapp.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class PostService {

    private final UserService userService;
    private final PostRepository postRepository;
    public Post submitPostToDb(Post post){
        return postRepository.save(post);
    }
    public ArrayList<Post> retrievePostFromDb(){
        ArrayList<Post> postArrayList = postRepository.findAll();
        for(Post postItem: postArrayList){
            Post postValue = postItem;
            String userIdfromPost = postValue.getUserId();
            postValue.setUserName(userService.displayUserData(userIdfromPost).getUserName());
        }

        Collections.sort(postArrayList,(a,b)->b.getId()-a.getId());
        return postArrayList;
    }
}
