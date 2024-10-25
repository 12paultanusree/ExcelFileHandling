import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/internship";
    private static final String USER = "root";
    private static final String PASSWORD = "qwerty";

    public void saveEmployeesToDatabase(List<Employee> employees) {
        String sql = "INSERT INTO user (id, name, email, salary) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            for (Employee emp : employees) {
                pstmt.setInt(1, emp.getId());
                pstmt.setString(2, emp.getName());
                pstmt.setString(3, emp.getEmail());
                pstmt.setDouble(4, emp.getSalary());
                pstmt.executeUpdate();
            }
            System.out.println("Data saved to database successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
