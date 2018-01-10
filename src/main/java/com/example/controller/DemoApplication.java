package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.User;
import com.example.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = { "com.example.service", "com.example.mapper","com.example.aspect","com.example.adepter" })
@RequestMapping("userController")
@MapperScan("com.example.mapper")
@ServletComponentScan("com.example.druid")
public class DemoApplication {
    @Autowired
    private UserService us;
    @RequestMapping("/index")

    public String index() {

        return "index2";
    }

    @RequestMapping("/login")
/**
* @Author : 凌勇.
* @Description : login 
* @Params  :  [user, request]
* @ReturnType :  org.springframework.web.servlet.ModelAndView
* @Date : 14:48, 2018/1/8
*/
    public ModelAndView login(@ModelAttribute User user, HttpServletRequest request) {
        ModelAndView        mav = new ModelAndView();
        Map<Object, Object> map = new HashMap<>();
        HttpSession session=request.getSession();
        map.put("username", user.getU_name());
        map.put("userpwd", user.getU_pwd());

        User u = us.getUser(map);


        if (u != null) {
            session.setAttribute("user",u);

            mav.addObject("user1", u);
            mav.setViewName("index1");
        } else {
            mav.setViewName("index2");
        }

        return mav;
    }



    public static void main(String[] args) {

         SpringApplication.run(DemoApplication.class, args);
    }
}



