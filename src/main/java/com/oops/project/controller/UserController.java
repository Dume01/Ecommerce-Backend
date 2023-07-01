package com.oops.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.oops.project.dto.ResponseDto;
import com.oops.project.dto.user.SignInDto;
import com.oops.project.dto.user.SignInResponseDto;
import com.oops.project.dto.user.SignupDto;
import com.oops.project.dto.user.UserCreateDto;
import com.oops.project.dto.user.UserUpdateDto;
import com.oops.project.exceptions.AuthenticationFailException;
import com.oops.project.exceptions.CustomException;
import com.oops.project.model.User;
import com.oops.project.repository.UserRepository;
import com.oops.project.service.AuthenticationService;
import com.oops.project.service.UserService;

import java.util.List;

@RequestMapping("user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> findAllUser(@RequestParam("token") String token) throws AuthenticationFailException {
        authenticationService.authenticate(token);
        return userRepository.findAll();
    }

    @PostMapping("/signup")
    public ResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    //TODO token should be updated
    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException {
        return userService.signIn(signInDto);
    }

    @PostMapping("/updateUser")
    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserUpdateDto userUpdateDto) {
        authenticationService.authenticate(token);
        return userService.updateUser(token, userUpdateDto);
    }


   @PostMapping("/createUser")
    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserCreateDto userCreateDto)
           throws CustomException, AuthenticationFailException {
        authenticationService.authenticate(token);
      return userService.createUser(token, userCreateDto);
  }
}
