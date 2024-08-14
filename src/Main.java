import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String sqlStatement="select * from Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/thogaKade", "root", "root");
            Statement stm= connection.createStatement();
            ResultSet res=stm.executeQuery(sqlStatement);
            res.next();
            String id = res.getString("id");
            String name = res.getString("name");
            String address = res.getString("address");
            String salary = res.getString("salary");

            System.out.println(id + " " + name + " " + address + " " + salary);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found");
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
