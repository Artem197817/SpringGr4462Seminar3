package ru.geekbrain.example3sem3hometask.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrain.example3sem3hometask.domain.Users;
import ru.geekbrain.example3sem3hometask.services.DataProcessingService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@Data
@AllArgsConstructor
public class TaskController {


    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }

    @GetMapping("/sort")//localhost:8080/tasks/sort
    public List<Users> sortUsersByAge() {
        return service.sortUsersByAge();
    }

    @GetMapping("/filter/{age}")
    public List<Users> filterUsersByAge(@PathVariable int age) {
        return service.filterUsersByAge(age);
    }

    @GetMapping("/calc")
    public double calculateAverageAge() {
        return service.calculateAverageAge();
    }
}

