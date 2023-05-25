package com.cengzayhn.cloneapp.Controller;

import com.cengzayhn.cloneapp.Entity.Story;
import com.cengzayhn.cloneapp.Service.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/story")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class StoryController {

    private final StoryService storyService;

    @PostMapping("")
    public Story submitStory(@RequestBody Story story){
        return storyService.submitData(story);
    }
    @GetMapping("")
    public ArrayList<Story> getAllStories(){
        return storyService.retrieveStory();
    }
}
