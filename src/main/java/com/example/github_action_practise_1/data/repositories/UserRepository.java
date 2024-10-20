package com.example.github_action_practise_1.data.repositories;

import com.example.github_action_practise_1.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
