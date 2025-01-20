import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    public static Connection createC(){
        Connection con = null;

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection
            String user="root";
            String password = "admin123";
            String url="jdbc:mysql://localhost:3306/student_manage";
            con= DriverManager.getConnection(url,user,password);

        }
        catch (Exception e) {
            System.out.println("Error loading driver");
        }
        finally {
            try {
                // Close the connection
                if (con == null) {
                    con.close();
                    System.out.println("Connection closed successfully.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return con;
    }

}
