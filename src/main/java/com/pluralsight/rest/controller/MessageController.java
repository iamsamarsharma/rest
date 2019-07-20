package com.pluralsight.rest.controller;


import com.pluralsight.rest.model.MessageDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping("/message")
    MessageDao send(){
        return new MessageDao("First Message");
    }

    @PostMapping("/message")
    MessageDao echo(@RequestBody MessageDao messageDao){
        return messageDao;
    }
}
