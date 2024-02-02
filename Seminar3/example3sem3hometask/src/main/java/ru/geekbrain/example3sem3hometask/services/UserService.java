package ru.geekbrain.example3sem3hometask.services;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.Users;

@Service
@Data
@AllArgsConstructor
public class UserService {


    private NotificationService notificationService;


    public Users createUser(String name, int age, String email) {
        Users user = new Users();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }


}
