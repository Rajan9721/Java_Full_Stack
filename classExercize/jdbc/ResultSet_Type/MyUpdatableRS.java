package classExercize.jdbc.ResultSet_Type;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyUpdatableRS{
	public static void main(String[] args){
		Statement st = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0170");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select accno,bal from bank2");
			rs.next();
			rs.next();
			rs.deleteRow();
			System.out.println("Record Deleted");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}