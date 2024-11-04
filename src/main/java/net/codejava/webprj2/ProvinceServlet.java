package net.codejava.webprj2;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/province")
public class ProvinceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String provinceId = request.getParameter("id");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Tourist Information for Province " + provinceId + "</h1>");
            
            out.println("<p>Details about tourist attractions and more...</p>");
            out.println("<p><a href='home'>Back to Home</a></p>");
        }
    }
}
