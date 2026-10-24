package com.youssadi.demojee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hello2", value = "/hello2")
public class Hello2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = (String)req.getAttribute("param");
        if(param==null) param = "Pas de donnees de requete";
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + param + "</h1>");
        out.println("</body></html>");
        out.close();
    }
}
