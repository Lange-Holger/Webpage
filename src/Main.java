import java.sql.*;
import java.sql.ResultSet;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/userdb", "root", "rootpassword");
        String sqlAbfrage = "SELECT * FROM nutzerdaten WHERE username = ? and passwort =?";
        PreparedStatement statement = conn.prepareStatement(sqlAbfrage);
        statement.setString(1, showInputDialog("Bitte Username eingeben"));

        statement.setString(2, showInputDialog("Bitte Passwort eingeben"));
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            System.out.print("gefunden");
        } else {
            System.out.println("nicht gefunden");
        }
        conn.close();



    }
}
