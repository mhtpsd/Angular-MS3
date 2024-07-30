package JdbcPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Crud {
    Scanner scan = new Scanner(System.in);
    RegistrationBean rb = new RegistrationBean();
        void getData() {
            System.out.println("Enter name:");
            rb.setName(scan.next());
            System.out.println("Enter the mail:");
            rb.setEmailId(scan.next());
            System.out.println("Enter the phone number:");
            rb.setPhoneNo(scan.nextLong());
        }

        void insertData() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","root");
                PreparedStatement ps = connection.prepareStatement("insert into registration (name,emailId,phoneNo) values(?,?,?)");
                ps.setString(1, rb.getName());
                ps.setString(2, rb.getEmailId());
                ps.setLong(3, rb.getPhoneNo());
                int res = ps.executeUpdate();

                if(res>0) {
                    System.out.println("Insert Successfully");
                }
                else {
                    System.out.println("Error in Insertion");
                }
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }
    public static void main(String[] args) {
        
        
    }
}
