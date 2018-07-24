import com.mysql.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

@WebServlet(name = "Generateur", urlPatterns = "/generateur")
public class Generateur extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Class driverClass = Class.forName("com.mysql.jdbc.Driver");
            Driver driver = (Driver) driverClass.newInstance();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet4", "root", "jecode4wcs");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM word");
            ResultSet resultSet = preparedStatement.executeQuery();

            ArrayList<String> listSujets = new ArrayList<String>();
            ArrayList<String> listVerbes = new ArrayList<String>();
            ArrayList<String> listComplements = new ArrayList<String>();

            while (resultSet.next()) {
                String word = resultSet.getString("word");
                int idType = resultSet.getInt("id_type");
                if (idType == 1) {
                    listSujets.add(word);
                } else if (idType == 2) {
                    listVerbes.add(word);
                } else if (idType == 3) {
                    listComplements.add(word);
                }
            }

            Random random = new Random();
            String sujet = listSujets.get(Math.max(0, random.nextInt(listSujets.size()) - 1));
            String verbe = listVerbes.get(Math.max(0, random.nextInt(listSujets.size()) - 1));
            String complement = listComplements.get(Math.max(0, random.nextInt(listSujets.size()) - 1));
            request.setAttribute("sujet", sujet);
            request.setAttribute("verbe", verbe);
            request.setAttribute("complement", complement);

            this.getServletContext().getRequestDispatcher("/WEB-INF/generateur.jsp").forward(request, response);


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/superBaseSecrete.jsp").forward(request, response);
    }
}
