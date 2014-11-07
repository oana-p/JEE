package ro.teamnet.z2h.web;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ZeroToHeroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(handleRequest(req));
    }

    private String handleRequest(HttpServletRequest req) {

        String obj = "Hello <b>" + req.getParameter("firstName")  + " " + req.getParameter("lastName") + "</b>! Enjoy Zero To Hero!!!";

        return obj;
    }
}
