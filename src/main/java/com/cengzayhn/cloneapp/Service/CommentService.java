package com.cengzayhn.cloneapp.Service;

import com.cengzayhn.cloneapp.Entity.Comments;
import com.cengzayhn.cloneapp.Entity.Story;
import com.cengzayhn.cloneapp.Repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final UserService userService;
    public Comments submitCommenttoDb(Comments comment){
        return  commentRepository.save(comment);
    }
    public ArrayList<Comments> getAllCommentsForDb(String postId){
        ArrayList<Comments> commentArrayList = commentRepository.findAllByPostId(postId);
        for (Comments commentItem:commentArrayList){
            Comments commentValue = commentItem;
            String userIdfromComment = commentValue.getUserId();
            commentValue.setUserName(userService.displayUserData(userIdfromComment).getUserName());
        }

        /*for (int i = 0; i<commentArrayList.size();i++){
            Comments commentValue = commentArrayList.get(i);
            commentValue.setUserName(userService.displayUserData(commentValue.getUserId()).getUserName());
        }*/
        return commentArrayList;
    }
}
