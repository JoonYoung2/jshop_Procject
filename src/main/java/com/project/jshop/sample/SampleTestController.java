package com.project.jshop.sample;

import com.project.jshop.dto.UserInfoDTO;
import com.project.jshop.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SampleTestController {

    @Autowired
    private SampleService service;

    @RequestMapping("/sample")
    public @ResponseBody String sample(){
        List<UserInfoDTO> result = service.getUserInfo();
        return result == null || result.isEmpty() ? "Object is Null" : result.toString();
    }
}
