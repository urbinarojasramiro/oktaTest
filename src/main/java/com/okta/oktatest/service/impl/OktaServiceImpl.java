package com.okta.oktatest.service.impl;

import com.okta.oktatest.dto.NewUserDTO;
import com.okta.oktatest.dto.UserDTO;
import com.okta.oktatest.service.OktaService;
import com.okta.oktatest.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("oktaService")
public class OktaServiceImpl implements OktaService {

    private static Logger LOG = LoggerFactory.getLogger(OktaServiceImpl.class);

    @Override
    public List<UserDTO> getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = getHeaders();

        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        String url = Constants.OKTA_DOMAIN+"/api/v1/users?limit=200";

        ResponseEntity<UserDTO[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET,httpEntity, UserDTO[].class);

        List<UserDTO> userDTOList = new ArrayList<>();
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            LOG.info(responseEntity.getBody().toString());
            userDTOList.addAll(Arrays.asList(responseEntity.getBody()));
        }
        return userDTOList;
    }

    @Override
    public UserDTO createUserWithPassword(NewUserDTO newUserDTO) {
        LOG.info("createUserWithPassword");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = getHeaders();

        HttpEntity<NewUserDTO> httpEntity = new HttpEntity<NewUserDTO>(newUserDTO,httpHeaders);
        String url = Constants.OKTA_DOMAIN+"/api/v1/users?activate=true";

        ResponseEntity<UserDTO> responseEntity = restTemplate.exchange(url, HttpMethod.POST,httpEntity, UserDTO.class);
        LOG.info(responseEntity.getBody().toString());

        return responseEntity.getBody();
    }

    private static HttpHeaders getHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept","application/json");
        httpHeaders.set("Content-Type","application/json");
        httpHeaders.set("Authorization","SSWS "+ Constants.OKTA_TOKEN);

        return httpHeaders;
    }
}
