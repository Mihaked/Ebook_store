
package ebookstore;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.sql.ResultSet;


public class DBconnection  // take care this is the class which already exist 
{
    public static Connection con; 
public static void ConnectToSQL()   // to connect to SQL
{
    try
    {
String url = "jdbc:sqlserver://localhost:1433;databaseName=eBookStore;encrypt=true;trustServerCertificate=true;";
String username ="DB"; 
String password ="12345"; 
con= DriverManager.getConnection(url, username,password); 
System.out.println("CONNECTED"); 
}
 catch (SQLException ex)
 {
 Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex); 
 }}
public static void Close ()    // to close the connection of SQL
{ 
try
{ 
    con.close(); 
} 
catch (SQLException ex) 
{ System.out.println("ERROR Connection"); } 
}

public static boolean executeNonquary (String sqlStatement)    //to update, delete, insert
{
try   //ConnectToSQL(); 

{  
Statement stmt = con.createStatement(); 
stmt.execute(sqlStatement); 
return true; 
}
catch (SQLException e)
{ 
System.out.println(e);      //JOptionPane.showMessageDialog(null,"Cant make your edit"); 

return false;
}}

public static ResultSet GetData(String query) { //For SEARCH Process ONLY
        try {
            Statement s = con.createStatement();
            return s.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }}
}
