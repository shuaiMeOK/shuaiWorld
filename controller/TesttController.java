package com.yxtapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/TesttController")
@Controller
public class TesttController {


    @RequestMapping("/getStringTest")
    @ResponseBody
    public String getStringTest() {


        System.out.println(123);
        return "后端controller";
    }




}
