package com.seriesapp.seriesapp.service;

import com.seriesapp.seriesapp.exceptions.EntityNotFoundException;
import com.seriesapp.seriesapp.model.User;
import com.seriesapp.seriesapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
    }
}
