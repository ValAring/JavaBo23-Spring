package com.example.helloworldcontroller;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private List<Messages> messages = new ArrayList<>();
    private int idCounter = 0;

    @PostMapping
    public Messages addMessage(@RequestBody String theMessage, @RequestBody String name){
        Messages newMessage = new Messages();
        newMessage.setiD(String.valueOf(++idCounter));
        newMessage.setName(name);
        newMessage.setName(theMessage);
        messages.add(newMessage);
        return newMessage;
    }

    @GetMapping
    public List<Messages> getAllMessages() {
        return messages;
    }
}
