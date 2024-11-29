package classExercize.jdbc.ResultSet_Type;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyUpdatableRS1{
	public static void main(String[] args){
		Statement st = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0170");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from bank2");
			
			while(rs.next()){
				System.out.println(rs.getInt(1));
				if(rs.getInt(1) == 5000){
					rs.updateDouble(1,30);
					rs.updateRow();
					System.out.println("Record updated!!!");
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}