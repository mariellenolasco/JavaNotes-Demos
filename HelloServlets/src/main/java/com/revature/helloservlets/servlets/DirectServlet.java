package com.revature.helloservlets.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class DirectServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        //RequestDispatcher view = req.getRequestDispatcher("dirservpage.html");
        //view.forward(req,res);
        res.sendRedirect("dirservpage.html");
        //res.setContentType("text/html");
        //res.getWriter().write(getServletContext().getInitParameter("UserName"));
        }
}
