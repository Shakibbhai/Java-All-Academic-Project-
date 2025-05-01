package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import com.mylib.Utils; // From my-library

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("✅ Backend hit received!");

        // Call method from external library
        String message = Utils.getMessage();
        System.out.println("📦 Message from external library: " + message);

        resp.setContentType("text/html");
        resp.getWriter().write("<h2>Check server console for external library message!</h2>");
    }
}