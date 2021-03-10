import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleLoginServlet",urlPatterns = "/login")
public class SimpleLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if("admin".equals(username)&&"password".equals(password)){
            writer.println("<h1>Welcome"+username+"to Website</h1>");
        }else {
            writer.println("<h1>Long chua</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
