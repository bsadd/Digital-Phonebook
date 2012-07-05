package digitalphonebook;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample Model Class
 * @author Shafiul Azam
 */
public class PhonebookModel {

    private String name;
    private String contactNumber;
    private String emailAddress;
    private String address;

    private String databaseTable = "phonebook";     ///<  Table name in database
    
    private DBUtil dbConnection;

    /**
     * Constructor
     * @param dbConnection 
     */
    public PhonebookModel(DBUtil dbConnection) {
        this.dbConnection = dbConnection;
    }

    /**
     * Sets all properties
     * @param name
     * @param contactNumber
     * @param emailAddress
     * @param address 
     */
    public void setAll(String name, String contactNumber, String emailAddress, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    /**
     * Inserts object in database
     * @return boolean - Always returns true. Improve it...
     */
    public boolean insertInDatabase(){
        String query = "INSERT INTO " + this.databaseTable + " VALUES('" + this.name + "', '" + this.contactNumber
                + "', '" + this.emailAddress + "', '" + this.address+ "')";
        try {
            this.dbConnection.stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(PhonebookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
   
}
