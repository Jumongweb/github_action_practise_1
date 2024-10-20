//package com.example.github_action_practise_1;
//
//import com.example.github_action_practise_1.dtos.request.RegisterRequest;
//import com.example.github_action_practise_1.dtos.response.RegisterResponse;
//import com.example.github_action_practise_1.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@SpringBootTest
//public class UserServiceTest {
//
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void testRegisterUser(){
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setEmail("Email");
//        registerRequest.setPassword("Password");
//        RegisterResponse registerResponse = userService.register(registerRequest);
//        assertThat(registerResponse).isNotNull();
//        assertThat(registerResponse.getMessage()).isEqualTo("Registration successful");
//
//    }
//}
