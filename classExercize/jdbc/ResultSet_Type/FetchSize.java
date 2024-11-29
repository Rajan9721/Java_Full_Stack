package classExercize.jdbc.ResultSet_Type;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchSize{
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0170");
		
		// Get the fetch size of a statement
		Statement stmt = con.createStatement();
		int fetchSize = stmt.getFetchSize();
		System.out.println(fetchSize);
		
		//Set the fetch size on the statement
		stmt.setFetchSize(100);
		fetchSize = stmt.getFetchSize();
		System.out.println(fetchSize);
		
		// Create a resultSet
		
		ResultSet resultSet = stmt.executeQuery("select * from bank1");
		fetchSize = resultSet.getFetchSize();
		System.out.println(fetchSize+" via resultset before");
		
		
		// Change the fetch size on the resultset 
		resultSet.setFetchSize(200);
		fetchSize = resultSet.getFetchSize();
		System.out.println(fetchSize+" via resultset after");
		stmt.setFetchSize(500);
		fetchSize = resultSet.getFetchSize();
		
		System.out.println(fetchSize+" via resultSet after changing in statement");
	}
}