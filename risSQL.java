/*
 * This code is originally made by the author
 */
package posuas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author arissetyawan.email@gmail.com
 */
public class risSQL {
    private static Connection myConnection;
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/pos_uas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "zxcvbnm,./";

    static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection success");
        }
        catch (ClassNotFoundException e){
            System.out.println("Connection failed: " + e.toString());
        }
        try{
            myConnection = (Connection) DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Database connected to "+ CONNECTION_STRING);
        } catch (Exception ex) {
           System.out.println("Connection failed:"  + CONNECTION_STRING + " => Error: " + ex.getMessage());
        }
        return myConnection;
    }
  
    static boolean execute(String query){
      try{
            Statement st;
            st = connect().createStatement();
            return st.executeUpdate(query) > 0;
      }catch(Exception ex){
           System.out.println("Query failed:"  + query + " => Error: " + ex.getMessage());
           return false;
      }
 
  }
 
}

