package io.javabrains.springbootstarter.domain._1_topic;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TopicController {

    private TopicService topicService;


    @ApiOperation(value = "Find All Topics",
            responseContainer = "List",
            response = Topic.class)
    @GetMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }


    @ApiOperation(value = "Find Topics by ID",
            notes = "Provide an id to look up specific topic",
            response = Topic.class)
    @GetMapping(value = "/topics/{id}")
    public Topic getTopic(@ApiParam(value = "ID value for the contact you need to retrieve", required = true)
                          @PathVariable String id) {
        return topicService.getTopic(id);
    }

    @ApiOperation(value = "Add new Topic",
            notes = "Provide an topic to be added in a body")
    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @ApiOperation(value = "Update a Topic",
            notes = "Provide an id of topic for update, and new representation of topic")
    @PutMapping(value = "/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    @ApiOperation(value = "Add new Topic",
            notes = "Provide an topic's id")
    @DeleteMapping(value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
