package com.example.dokgodieserver.domain.grade.repository;

import com.example.dokgodieserver.domain.grade.Grade;
import com.example.dokgodieserver.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Optional<Grade> findByUser(User user);
}
