import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "MenuPrincipale", urlPatterns = "/principale")
public class MenuPrincipale extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<IdeesConstructor> ideas = new ArrayList<IdeesConstructor>();

        ideas.add(new IdeesConstructor("soleil", "manger", "kiwis"));
        ideas.add(new IdeesConstructor("marc", "manger", "chat"));
        ideas.add(new IdeesConstructor("matin", "manger", "chat"));
        ideas.add(new IdeesConstructor("aller", "manger", "chat"));
        ideas.add(new IdeesConstructor("aller", "manger", "chat"));
        ideas.add(new IdeesConstructor("aller", "manger", "chat"));

        request.setAttribute("list", ideas);


        this.getServletContext().getRequestDispatcher("/WEB-INF/pagePrincipale.jsp").forward(request, response);
    }
}
