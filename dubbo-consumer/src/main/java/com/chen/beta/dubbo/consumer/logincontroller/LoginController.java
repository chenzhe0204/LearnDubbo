package com.chen.beta.dubbo.consumer.logincontroller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.chen.beta.dubbo.api.entity.Users;
import com.chen.beta.dubbo.api.loginservice.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.List;


@Controller
public class LoginController {

    @Reference
    private LoginService loginService;

    /**
     * 登录页面
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String Login(Model model) {
        Users user = (Users) model.getAttribute("users");
        if (user == null) {
            model.addAttribute("user",new Users());
            return "login";
        } else {
            return "hello";
        }
    }

    /**
     * 用户页面
     *
     * @param model
     * @param user
     * @return
     */
    @RequestMapping(value = "/hello")
    public String Hello(HttpSession session, Users user) {
        if (user.getAccount() == null || user.getPassword() == null){
            //model.addAttribute("user",new Users());
            session.setAttribute("user",new Users());
            return "login";
        }
        Users users = loginService.getUser(user);
        //model.addAttribute("users", users);
        session.setAttribute("user",users);
        return "hello";
    }




}
