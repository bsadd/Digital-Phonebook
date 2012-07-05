package digitalphonebook;

import java.util.Scanner;

/**
 * View class
 * @author Shafiul Azam
 */
public class PhonebookView {

    private PhonebookController controller;

    /**
     * Prepares the user interface of the program.
     */
    public void run() {
        // Create object of Scanner class so that we can take input from command-line
        Scanner myScanner = new Scanner(System.in);

        String inputLine;

        // Show prompt
        this.generalPrompt();
        
        while (myScanner.hasNextLine()) {
            // Scan next line from command-prompt
            inputLine = myScanner.nextLine();

            // Deceide which operation to do...
            if (inputLine.equals("insert")) {
                System.out.print("name contact email address: ");
                String query = myScanner.nextLine();
                this.controller.insertOperation(query);

            } else if (inputLine.equals("udpate")) {
                // code for update. Sample code may look like:
//                this.controller.updateOperation();
            } else if (inputLine.equals("quit")) {
                // Bye bye...
                break;
            }
            // Display Prompt
            this.generalPrompt();
        }
    }
    
    public void generalPrompt(){
        System.out.print("insert/update/delete/quit? ");
    }

    /**
     * Displays a success message
     *
     * @param type
     */
    public void successMessage(String type) {
        System.out.println(type + " operation completed successfully!");
    }

    /**
     * @return the controller
     */
    public PhonebookController getController() {
        return controller;
    }

    /**
     * @param controller the controller to set
     */
    public void setController(PhonebookController controller) {
        this.controller = controller;
    }
}
