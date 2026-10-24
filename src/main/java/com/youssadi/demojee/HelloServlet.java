package com.youssadi.demojee;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello1")
public class HelloServlet extends HttpServlet {
    private String message;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String param = "monParam";
        request.setAttribute("param", param);

        //request.getRequestDispatcher("hello2").forward(request, response);
        response.sendRedirect("/demojee-1.0-SNAPSHOT/hello2");
    }

    public void destroy() {
    }
}