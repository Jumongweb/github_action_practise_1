package com.example.github_action_practise_1.service;

import com.example.github_action_practise_1.data.repositories.UserRepository;
import com.example.github_action_practise_1.dtos.request.RegisterRequest;
import com.example.github_action_practise_1.dtos.response.RegisterResponse;
import com.example.github_action_practise_1.data.model.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        User newUser = modelMapper.map(registerRequest, User.class);
        User savedUser = userRepository.save(newUser);

        RegisterResponse registerResponse = modelMapper.map(savedUser, RegisterResponse.class);
        registerResponse.setMessage("Registration successful");
        return registerResponse;
    }

}
