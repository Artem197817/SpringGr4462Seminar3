package ru.geekbrain.example3sem3hometask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrain.example3sem3hometask.domain.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{

}
