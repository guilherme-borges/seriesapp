package com.seriesapp.seriesapp.repository;

import com.seriesapp.seriesapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
