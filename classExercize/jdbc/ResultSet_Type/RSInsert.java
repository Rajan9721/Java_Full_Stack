package classExercize.jdbc.ResultSet_Type;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


public class RSInsert{
	public static void main(String[] args){
		Statement st = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","0170");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select accno, bal from bank2");
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+"=");
				System.out.println(rs.getInt(2));
				System.out.println(" ");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}