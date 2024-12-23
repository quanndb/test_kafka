package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String userId;
    String userName;

    @Override
    public String toString() {
        return "User{userId=" + userId + ", userName=" + userName + '}';
    }
}
