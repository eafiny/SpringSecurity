package ru.geekbrains.SpringSecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.geekbrains.SpringSecurity.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
