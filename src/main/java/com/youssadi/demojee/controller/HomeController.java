package com.youssadi.demojee.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("/home/*")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlPattern = req.getContextPath() + "/home";

        if (req.getRequestURI().endsWith("action1")) {
            out.println("True for action1");
            RequestDispatcher rd = req.getRequestDispatcher("/action1");
            rd.forward(req, resp);
        }else if (req.getRequestURI().endsWith("action2")){
            out.println("True for action2");
            RequestDispatcher rd = req.getRequestDispatcher("/action2");
            rd.forward(req, resp);
        }else {
            PrintWriter out = resp.getWriter();
            out.println("<h1>" + req.getRequestURI() + "</h1>");
            out.println("<h2>" + urlPattern + "</h2>");
        }

    }
}
