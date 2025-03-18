package universe.punkdomus;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns={
        "/xpto",
        "/helloServlet"
})
public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Hello, Universe!</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }

}
