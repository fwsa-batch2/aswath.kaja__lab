import java.sql.*;
public class Createdb {
        public static void main(String[] args) {
            String url="jdbc:mysql://localhost:3306/Register";
            String name="root";
            String password="password";
            //
            try {
                Connection connection=DriverManager.getConnection(url,name,password);
                String sql="CREATE TABLE studentss(id int , name varchar(25))";
                Statement stmt=connection.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("table created...");
            }
            catch (SQLException e) {
                System.out.println("Not created..");
                e.printStackTrace();
            }
        }
    }  

