package com.revature.helloservlets.controllers;

import javax.servlet.http.HttpServletRequest;

public class HomeController {
    public static String home(HttpServletRequest req) {
        return "index.html";
    }
}
