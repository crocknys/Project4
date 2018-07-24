import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Handler;

@WebServlet(name = "CreateideaServlet", urlPatterns = "/create")
public class CreateideaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int SPLASH_TIME_OUT = 100;

        // recuperer donnée dun formulaire
        String sujet = (String) request.getParameter("sujet");
        String verbe = (String) request.getParameter("verbe");
        String cod = (String) request.getParameter("cod");
        PrintWriter out = response.getWriter();
        Integer idWord = null;
        Integer idSentence = null;

        if (sujet.isEmpty() || verbe.isEmpty() || cod.isEmpty()) {
            out.println("Remplissez tout les champs");
        } else {

            Class driverClass = null;
            try {

                driverClass = Class.forName("com.mysql.jdbc.Driver");
                Driver driver = (Driver) driverClass.newInstance();
                DriverManager.registerDriver(driver);
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet4", "root", "jecode4wcs");


                PreparedStatement preparedStatement = connection
                        .prepareStatement("INSERT INTO word (word,id_type) VALUES(?,?), (?,?), (?,?);");
                preparedStatement.setString(1, sujet);
                preparedStatement.setInt(2, 1);
                preparedStatement.setString(3, verbe);
                preparedStatement.setInt(4, 2);
                preparedStatement.setString(5, cod);
                preparedStatement.setInt(6, 3);
                preparedStatement.executeUpdate();

                preparedStatement = connection
                        .prepareStatement("INSERT INTO sentence VALUES(null);", Statement.RETURN_GENERATED_KEYS);
                preparedStatement.executeUpdate();



               try (ResultSet rs = preparedStatement.getGeneratedKeys()){
                   if (rs.next()) {
                       idSentence = rs.getInt(1);
                   } else {
                       throw new SQLException("Creating user failed, no ID obtained.");
                   }
               }


                preparedStatement = connection
                        .prepareStatement("SELECT * FROM word ");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    idWord = resultSet.getInt("id_word");
                }


                preparedStatement = connection
                        .prepareStatement("INSERT INTO sentence_word  VALUES(?,?), (?,?), (?,?);");
                preparedStatement.setInt(1, idWord);
                preparedStatement.setInt(2, idSentence);
                preparedStatement.setInt(3, idWord - 1);
                preparedStatement.setInt(4, idSentence);
                preparedStatement.setInt(5, idWord - 2);
                preparedStatement.setInt(6, idSentence);

                preparedStatement.executeUpdate();
                out.println("Votre proposition a été enregistré : "+sujet+" "+verbe+" "+cod);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

            out.println("Votre proposition a été enregistré : "+sujet+" "+verbe+" "+cod);


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext()
                .getRequestDispatcher("/WEB-INF/createidea.jsp")
                .forward(request, response);

    }
}
