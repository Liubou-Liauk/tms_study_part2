package com.example.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello")
public class  HelloServlet extends HttpServlet {
    private String message;
    public void init(ServletConfig servletConfig) {
        System.out.println("Servlet init");
        message = servletConfig.getServletContext().getInitParameter("name");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        final List<String> products = Arrays.asList("phone", "TV", "laptop");
        out.println("<html><body>");
        for (String product: products) {
            out.println("<h1>" + products + "!!! </h1>");
        }
        out.println("<h1>" + message + "!!! </h1>");
        out.println("</body></html>");
    }

    public void destroy() {
       System.out.println("Servlet destroy");
    }
}