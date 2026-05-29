package dao;
import model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
//Câu lệnh sau tùy thuộc vào bảng dữ liệu trong database
//Truy vấn database lấy id, masv, hoten
        String sql = "SELECT id, masv, hoten FROM SINHVIEN";
// HOẶC


        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("masv"),
                        rs.getString("hoten")

                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}