package com.example.springbootscylla.presentation;

import com.example.springbootscylla.domain.model.ChatNotification;
import com.example.springbootscylla.domain.model.FriendNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class NotificationController {

    private final SimpMessagingTemplate messagingTemplate;

    @PostMapping("/api/friend/add")
    public String addFriend(@RequestBody FriendNotification notification) {
        messagingTemplate.convertAndSend("/topic/friend", notification);
        return "Friend notification sent";
    }

    @PostMapping("/api/chat/notify")
    public String notifyChat(@RequestBody ChatNotification notification) {
        messagingTemplate.convertAndSend("/topic/chat", notification);
        return "Chat notification sent";
    }
}
