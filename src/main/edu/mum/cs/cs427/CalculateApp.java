package edu.mum.cs.cs427;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateApp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int sum = Integer.parseInt( req.getParameter("num1")) + Integer.parseInt( req.getParameter("num2"));
        int multiply = Integer.parseInt( req.getParameter("num3")) + Integer.parseInt( req.getParameter("num4"));

        PrintWriter out = resp.getWriter();
        out.println(req.getParameter("num1")  + " + " + req.getParameter("num2") + " = " + sum);
        out.println(req.getParameter("num3")  + " + " + req.getParameter("num4") + " = " + multiply);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
