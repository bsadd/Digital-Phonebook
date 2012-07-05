package digitalphonebook;

/**
 * Controller Class
 * @author Shafiul
 */
public class PhonebookController {
    
    private PhonebookModel model;
    private PhonebookView view;

    /**
     * Constructor
     * @param model
     * @param view 
     */
    public PhonebookController(PhonebookModel model, PhonebookView view) {
        this.model = model;
        this.view = view;
        
        // pass itself to the view. Usint this reference View can call the Controller
        // when it Detects any user interaction and needs to access Models.
        
        this.view.setController(this);
    }

    
    
    /**
     * Inserts a single phone-book entry in Database
     * @param data
     */
    public void insertOperation(String data) {
        // split the user provided line based on "Space"
        String[] dataToInsert = data.split(" ");
        // Create a Model object so that we may insert it in database...
        this.model.setAll(
                dataToInsert[0],
                dataToInsert[1],
                dataToInsert[2],
                dataToInsert[3]);
        // Also saves them permanently in Database
        this.model.insertInDatabase();
        // Update View
        this.view.successMessage("Insert");
    }

    public void updateOperation() {
        // do it yourself...
    }
}
