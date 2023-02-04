package com.project.jshop.sample.service;

import com.project.jshop.dto.UserInfoDTO;
import com.project.jshop.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    UserInfoRepository repository;

    public List<UserInfoDTO> getUserInfo(){
        return repository.selectAllUserInfo();
    }

}
