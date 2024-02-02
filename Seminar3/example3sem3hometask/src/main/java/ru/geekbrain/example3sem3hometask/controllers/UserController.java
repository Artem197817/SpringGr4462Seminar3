package ru.geekbrain.example3sem3hometask.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import ru.geekbrain.example3sem3hometask.domain.Users;
import ru.geekbrain.example3sem3hometask.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/users")
@Data
@AllArgsConstructor
public class UserController {

    private RegistrationService service;

    @GetMapping
    public List<Users> userList() {
        return service.getDataProcessingService().findAll();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody Users user) {
        service.getDataProcessingService().saveUser(user);
        return "User added from body!";
    }

    @PostMapping("/param")
    public String userAddFromParam(@RequestParam("name") String name,
                                   @RequestParam("age") int age,
                                   @RequestParam("email") String email) {
        service.processRegistration(name, age, email);
        return "User added from body!";
    }
}
