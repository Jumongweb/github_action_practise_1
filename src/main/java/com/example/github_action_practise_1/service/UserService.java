package com.example.github_action_practise_1.service;

import com.example.github_action_practise_1.dtos.request.RegisterRequest;
import com.example.github_action_practise_1.dtos.response.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest registerRequest);
}
