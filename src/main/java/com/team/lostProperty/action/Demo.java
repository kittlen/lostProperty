package com.team.lostProperty.action;

import com.team.lostProperty.entities.Result;
import com.team.lostProperty.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("demo")
public class Demo {

    @RequestMapping("1")
    @ResponseBody
    public String getDemo(){
        return "进入了demo/1";
    }

    @RequestMapping("2")
    public String getDemo2(Model model){
        model.addAttribute("mgs","DemoTest");
        return "demo";
    }


    @RequestMapping("3")
    public String OrderTest(){
        return "orderTest";
    }

    @Resource
    private UserService userService;


    @RequestMapping("4")
    public String MybatisTest(){
        userService.getUser();
        return "orderTest";
    }

}
