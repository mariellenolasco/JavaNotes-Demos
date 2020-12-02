package com.revature.helloservlets.servlets;

import com.revature.helloservlets.controllers.HomeController;
import com.revature.helloservlets.controllers.LogInController;

import javax.servlet.http.HttpServletRequest;

public class Dispatcher {
    public static String dispatchTo(HttpServletRequest req){
        System.out.println(req.getRequestURI());
        switch(req.getRequestURI()){
            case "/HelloServlets/login.change":
                return LogInController.login(req);
            case "/HelloServlets/home.change":
                return HomeController.home(req);
            default:
                return "wrongclick.html";
        }
        //return "wrongclick.html";
    }
}
