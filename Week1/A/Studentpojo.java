package A;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Studentpojo {
    Connection con;

    public Studentpojo(Connection con) {
        this.con = con;
    }

    public Student createStudent (Student student) throws SQLException {
        String sql = "insert into Student (Name,Marks) values (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, student.getStudentName());
            ps.setInt(2, student.getMarks());
            ps.executeUpdate();
            ResultSet generatedkeys = ps.getGeneratedKeys();
            if(generatedkeys.next()){
                student.setStudentID(generatedkeys.getInt(1));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public Student GetByID ( int StudentID) throws SQLException {
        String sql = "select"
    }
}
