import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet
{
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            // Set the response content type
            response.setContentType("text/html");

            // Write "Hello, World!" to the response
            response.getWriter().println("Hello,,,,,World!");
        }
    }




