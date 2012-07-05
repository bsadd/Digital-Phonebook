package digitalphonebook;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Database Utility - for managing connections
 * @author user
 */
public class DBUtil {

    Connection connect;
    Statement stmt;
    ResultSet result;
    
    private String database = "digital_phonebook";              ///<    Name of the database
    private String databaseUser = "root";                       ///<    Username
    private String databasePassword = "";                       ///<    Password
    private String databaseHost = "jdbc:mysql://localhost/";    ///<    Do not change otherwise necessary

    DBUtil() {
        try {
            this.connect = (Connection) DriverManager.getConnection(this.databaseHost + this.database, 
                    this.databaseUser, this.databasePassword);
            this.stmt = (Statement) connect.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
