package com.cengzayhn.cloneapp.Repository;

import com.cengzayhn.cloneapp.Entity.Story;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface StoryRepository extends CrudRepository<Story,Integer> {
    Story save(Story story);
    ArrayList<Story> findAll();

}
