import java.io.Console;

/**
* The class ContactsApp contains the programs main-method.
* It is used to parse user-input.
*
* The main method contains a loop of sentencs that are printed to the user.
* The program takes the user input and sends it to Input.java file.
* Then it prints out what Input.java returns to it.
*
* @author Aalo Kuuspalo
*/
public class ContactsApp {
    /**
    * Takes user input and calls a method to process it.
    *
    * Prints out the options to user and reads user input.
    * Calls the input method. Breaks the loop and stops the program.
    */
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Welcome to ContactsApp");
        while (0 < 1) {
        System.out.println("[create] choose 1 to create new entry");
        System.out.println("[read] choose 2 to read entries");
        System.out.println("[update] choose 3 to update an entry");
        System.out.println("[delete] choose 4 to delete an entry");
        System.out.println("[exit] choose 5 to exit program");
        String command = Input.commandInput(Integer.parseInt(c.readLine()));
            System.out.println(command);
            if (command.equals("Goodbye")) {
                break;
            }
        }
    }
}
