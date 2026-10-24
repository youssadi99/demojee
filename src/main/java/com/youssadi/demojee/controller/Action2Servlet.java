package com.youssadi.demojee.controller;

import com.youssadi.demojee.model.Person;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/action2")
public class Action2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person();
        person.setAge(34);
        person.setName("Ahmed");
        req.setAttribute("prs", person);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view2.jsp");
        dispatcher.forward(req, resp);
    }
}
