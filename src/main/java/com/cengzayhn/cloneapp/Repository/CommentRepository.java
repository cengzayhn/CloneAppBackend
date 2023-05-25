package com.cengzayhn.cloneapp.Repository;

import com.cengzayhn.cloneapp.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends CrudRepository<Comments,Integer> {
    Comments save(Comments comment);
    ArrayList<Comments> findAllByPostId(String postId);
}
