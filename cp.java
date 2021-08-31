import java.sql.*;
public class cp {
static Connection con;
public static Connection create() {
	try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user="root";
		String password="244466666";
		String url="jdbc:mysql://localhost:3306/student_manage";
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return con;
}
}
