import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String sqlStatement="update Customer set salary=salary*1.5";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/thogaKade", "root", "root");
            Statement stm= connection.createStatement();
            int res=stm.executeUpdate(sqlStatement);
            if(res>0){
                System.out.println("Update success!!!");
                System.out.println("No if row count " + res);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
