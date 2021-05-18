package ru.geekbrains.SpringSecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.geekbrains.SpringSecurity.entities.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String userName);
}
