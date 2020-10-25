package sk.jaro.database;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String user = "jaro";
        String password = "heslo123";
        String host="localhost";
        String port="3306";
        String dbname="databasename";
        Connection connection = null;
        Statement st = null;
        long id = 10l;
        try {
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename?characterEncoding=UTF-8",user,password);

            connection.setAutoCommit(false);

            st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM OSOBA");

            String query = "SELECT * FROM Osoba WHERE id = "+id;
            String query2 = String.format("SELECT * FROM Osoba WHERE id = %d",id);
            StringBuilder query3 = new StringBuilder("SELECT * FROM Osoba WHERE id =").append(id);

            PreparedStatement statement =
                    connection.prepareStatement("INSERT INTO Osoba(Meno,Vek,Datum_Narodenia) VALUES (?,?,?)");
            statement.setString(1, "Jaro");
            statement.setInt(2, 30);
            statement.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
            statement.executeQuery();


            while(rs.next()){
                String meno = rs.getString(1);
                int vek = rs.getInt("AGE");
            }
            connection.commit();


        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            if(st!=null)
                st.close();
            connection.close();
        }


    }
}
