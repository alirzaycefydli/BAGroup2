package WWSIS.BAGroup2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	static final String URL = "jdbc:hsqldb:hsql://localhost/";
	
    public static void main( String[] args )
    {
        try {
        	Class.forName("org.hsqldb.jdbc.JDBCDriver");
        	test();
        }catch(Exception e) {
        	throw new RuntimeException(e);
        }
    }
    
    private static void test() throws SQLException {
    	Connection conn = DriverManager.getConnection(URL,"SA","");
    	
    	Statement stmt = conn.createStatement();
    	ResultSet rs = stmt.executeQuery("SELECT * FROM messages;");
    	
    	
    	while(rs.next()) {
    		System.out.print("ID: "+ rs.getString("text") + "\n");
    	}
    }
}
