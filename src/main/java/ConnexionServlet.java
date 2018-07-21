import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConnexionServlet", urlPatterns = "/connexion")
public class ConnexionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String password = (String) request.getParameter("password");
        PrintWriter out = response.getWriter();

        if (password.equals("1234")) {
            //a rediriger vers page principale
            response.sendRedirect("/create");
        } else {
            out.println(" tu t'es trompé, c'est pas bien");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext()
                .getRequestDispatcher("/WEB-INF/connexion.jsp")
                .forward(request, response);

    }
}
