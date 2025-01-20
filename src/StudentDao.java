import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentIntoDb(Student st) {
        boolean f = false;
        // JDBC
        try {
            Connection con = CP.createC();
            String q = "INSERT INTO students(sname, sphon, scity) VALUES (?, ?, ?)";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            pstmt.executeUpdate();

            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String q = "DELETE FROM students WHERE sid=?";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userId);

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void displayStudents() {
        try {
            Connection con = CP.createC();
            String q = "SELECT * FROM students";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(q);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String city = rs.getString(4);
                System.out.println("ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nCity: " + city);
                System.out.println("************************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean updateStudent(int id, String newName, String newPhone, String newCity) {
        boolean f = false;
        try {
            Connection con = CP.createC();
            String q = "UPDATE students SET sname = ?, sphon = ?, scity = ? WHERE sid = ?";

            PreparedStatement pstmt = con.prepareStatement(q);

            // Set new values
            pstmt.setString(1, newName);
            pstmt.setString(2, newPhone);
            pstmt.setString(3, newCity);
            pstmt.setInt(4, id);

            // Execute update
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
