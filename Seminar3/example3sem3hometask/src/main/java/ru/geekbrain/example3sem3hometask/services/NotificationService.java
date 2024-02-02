package ru.geekbrain.example3sem3hometask.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.Users;

@Service
@Data
public class NotificationService {

    public void notifyUser(Users user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
