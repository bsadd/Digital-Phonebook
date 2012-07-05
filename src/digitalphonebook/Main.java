
package digitalphonebook;


/**
 * Digital Phone-book: Sample project displaying MVC architecture
 * @author Shafiul Azam
 */
public class Main {

    public static void main(String[] args) {

        // Initiate Database Connection. We can use this single connection object
        // in many modles if we have many.
        DBUtil dbConnection = new DBUtil();
        
        // Create Model Object
        PhonebookModel model = new PhonebookModel(dbConnection);
        
        // Create View Object
        PhonebookView view = new PhonebookView();
        
        // Create controller object
        PhonebookController phonebookController =  new PhonebookController(model, view);

        // Start the View... let's go
        view.run();
    }

}
