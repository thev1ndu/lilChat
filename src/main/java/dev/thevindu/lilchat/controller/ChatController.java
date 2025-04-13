package dev.thevindu.lilchat.controller;

import dev.thevindu.lilchat.model.ChatMessage;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }
}
