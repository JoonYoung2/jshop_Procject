package com.project.jshop.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleTestController {

    @RequestMapping("/sample")
    public @ResponseBody String sample(){
        return "sample";
    }
    //hello
}
