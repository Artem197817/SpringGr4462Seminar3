package ru.geekbrain.example3sem3hometask.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.Users;
import ru.geekbrain.example3sem3hometask.repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
public class DataProcessingService {


    private UserRepository repository;


    public List<Users> findAll() {
        return repository.findAll();
    }

    public List<Users> sortUsersByAge() {
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Users::getAge))
                .collect(Collectors.toList());
    }

    public List<Users> filterUsersByAge(int age) {
        return repository.findAll().stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public double calculateAverageAge() {
        return repository.findAll().stream()
                .mapToInt(Users::getAge)
                .average()
                .orElse(0);
    }

    public void saveUser (Users user)
    {
        repository.save(user);
    }
}
