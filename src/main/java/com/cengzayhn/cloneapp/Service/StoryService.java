package com.cengzayhn.cloneapp.Service;

import com.cengzayhn.cloneapp.Entity.Post;
import com.cengzayhn.cloneapp.Entity.Story;
import com.cengzayhn.cloneapp.Repository.StoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StoryService {

    private final StoryRepository storyRepository;
    private final UserService userService;
    public Story submitData(Story story){
        return storyRepository.save(story);
    }

    public ArrayList<Story> retrieveStory(){
        ArrayList<Story> storyArrayList = storyRepository.findAll();
        for (Story storyItem:storyArrayList){
            Story storyValue = storyItem;
            String userIdfromStory = storyValue.getUserId();
            storyValue.setUserName(userService.displayUserData(userIdfromStory).getUserName());
        }

        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        return storyArrayList;
    }
}
















