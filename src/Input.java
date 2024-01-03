import java.io.Console;
/**
* The class Input contains a method for comparing user input 
* and calling the correct method based on it.
*
* The method receives an input from the main method
* and compares it to given values.
* It can either call methods, stop the program or return an error message.
* 
* @author Aalo Kuuspalo
* @param x the argument which is compared to strings.
* @return String with a message for the user.
*/
public class Input {
    public static final String NEXT_CONTACT = "What would you like to do next?";
    public static final String QUIT = "Goodbye";
    public static final String ERROR = "Please enter a valid number from 1-5";
    /**
    * Calls a method based on input and returns a message.
    *
    * Compares the argument to numbers 1-5 and calls a method
    * based on it.
    * Returns a message, or an error if argument is not
    * a number from 1-5.
    */
    public static String commandInput(String x) {
        Console c = System.console();

        if (x.equals("1")) {
            CreateFile.newContact();
            CreateFile.writeContact();
            return NEXT_CONTACT;
        } else if (x.equals("2")) {
            ReadFile.readContact();
            return NEXT_CONTACT;
        } else if (x.equals("3")) {
            ReadFile.editContact();
            return NEXT_CONTACT;
        } else if (x.equals("4")) {
            ReadFile.deleteContact();
            return NEXT_CONTACT;
        } else if (x.equals("5")) {
            return QUIT;
        } else {
            return ERROR;
        }
    }
}
