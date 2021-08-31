import java.sql.*;

public class StudentDao {
public static boolean insert(Student st) {
	boolean f=false;
	try {
		//jdbc code...
	Connection con=cp.create();
	String q="insert into student(sname, sphone,scity) values(?,?,?);";
//prepared statement
	PreparedStatement p=con.prepareStatement(q);
p.setString(1, st.getSname());
p.setString(2, st.getSphone());
p.setString(3, st.getScity());

//execute...
p.executeUpdate();
	f=true;
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}
	return f;
}

public static boolean delete(int userid) {
	
	boolean f=false;
	try {
		//jdbc code...
	Connection con=cp.create();
	String q="delete from student where sid=?;";
//prepared statement
	PreparedStatement p=con.prepareStatement(q);
p.setInt(1, userid);

//execute...
p.executeUpdate();
	f=true;
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}
	return f;
}

public static void showstudent() {
	// TODO Auto-generated method stub

	try {
		//jdbc code...
	Connection con=cp.create();
	String q="select * from student;";
//prepared statement
Statement st=con.createStatement();
//execute...

ResultSet rs=st.executeQuery(q);


while(rs.next()) {
		int id =rs.getInt(1);
String name=rs.getString(2);
String phone=rs.getString(3);
String city=rs.getString(4);

System.out.println("id: "+id);
System.out.println("name: "+name);
System.out.println("phone number: "+phone);
System.out.println("city: "+city);
System.out.println("++++++++++++++++++");
}
	}
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}

}

}
