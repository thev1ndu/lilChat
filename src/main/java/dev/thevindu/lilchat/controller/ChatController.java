package dev.thevindu.lilchat.controller;

import dev.thevindu.lilchat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage") // "/app/sendMessage" will handle the messages and broadcast to specified channels
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
}
