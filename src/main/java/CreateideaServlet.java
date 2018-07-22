import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateideaServlet", urlPatterns = "/create")
public class CreateideaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // recuperer donnée dun formulaire
        String sujet = (String) request.getParameter("sujet");
        String verbe = (String) request.getParameter("verbe");
        String cod = (String) request.getParameter("cod");

        request.setAttribute("sujet", sujet);
        request.setAttribute("verbe", verbe);
        request.setAttribute("cod", cod);
        // a envoyer sur basedonnées
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext()
                .getRequestDispatcher("/WEB-INF/createidea.jsp")
                .forward(request, response);

    }
}
