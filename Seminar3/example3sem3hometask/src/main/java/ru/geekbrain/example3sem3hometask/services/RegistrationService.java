package ru.geekbrain.example3sem3hometask.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.Users;

@Service
@Data
@AllArgsConstructor
public class RegistrationService {


    private DataProcessingService dataProcessingService;
    private UserService userService;
    private  NotificationService notificationService;


    public void processRegistration (String name, int age, String email){
        Users user = userService.createUser(name,age,email);
        dataProcessingService.saveUser(user);
        notificationService.notifyUser(user);
    }
}
