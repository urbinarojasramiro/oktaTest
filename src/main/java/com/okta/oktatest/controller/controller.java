package com.okta.oktatest.controller;

import com.okta.oktatest.dto.NewUserDTO;
import com.okta.oktatest.dto.UserDTO;
import com.okta.oktatest.service.OktaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    OktaService oktaService;

    @GetMapping("/")
    public String getUserName(@AuthenticationPrincipal OAuth2User user){
        return user.getAttributes().get("name").toString();
    }


    @GetMapping("/getUsers")
    public List<UserDTO> getUsers(){
        List<UserDTO> resp = oktaService.getUsers();
        return resp;
    }

    @GetMapping("/createUserWithPassword")
    public UserDTO createUserWithPassword(@RequestBody NewUserDTO newUserDTO){
        return oktaService.createUserWithPassword(newUserDTO);
    }
}
