package com.gourianova.binocularviusion;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/index")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("<title>You are welcome!</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<h3>"+"<a href=\"\\greeting.html\">&Cscr;ontinue</a> "+"</h3>"+"</center>");
        out.write("</body>");
        out.write("</html>");

    }
}
