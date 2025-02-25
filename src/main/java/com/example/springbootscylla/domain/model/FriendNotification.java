package com.example.springbootscylla.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FriendNotification {

    private String fromUser;
    private String toUser;
    private String message;
}

