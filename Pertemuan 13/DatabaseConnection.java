import java.sql.*;

public class DatabaseConnection {
 public static void main(String[] args) {
 Connection connection = null;
 try {
 connection =
DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","username"
,"password");
 System.out.println("Koneksi ke database berhasil!");
 } catch (SQLException e) {
 System.out.println("Koneksi ke database gagal!");
 e.printStackTrace();
 }
 }
}
