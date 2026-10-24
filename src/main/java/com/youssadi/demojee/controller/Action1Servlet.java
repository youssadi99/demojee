package com.youssadi.demojee.controller;

import com.youssadi.demojee.model.Person;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/action1")
public class Action1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person p = new Person();
        p.setName("John");
        p.setAge(30);
        req.setAttribute("person", p);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view1.jsp");
        dispatcher.forward(req, resp);

    }
}
