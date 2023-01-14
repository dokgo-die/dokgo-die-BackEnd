package com.example.dokgodieserver.domain.user.domain.repository;

import com.example.dokgodieserver.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
