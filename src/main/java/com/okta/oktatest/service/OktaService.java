package com.okta.oktatest.service;

import com.okta.oktatest.dto.NewUserDTO;
import com.okta.oktatest.dto.UserDTO;

import java.util.List;

public interface OktaService {
    List<UserDTO> getUsers();
    UserDTO createUserWithPassword(NewUserDTO newUserDTO);
}
