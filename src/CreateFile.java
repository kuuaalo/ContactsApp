import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* The class CreateFile contains methods for creating and editing files.
*
* The methods in this class create a new CSV file and edit it.
* They validate the user input. The methods in this class
* do not take parameters or return anything.
*
* @author Aalo Kuuspalo
*/

public class CreateFile {
    /**
    * Creates a new file if it doesn't already exist.
    *
    * If the file exists prints a notification for the user.
    * If the file doesn't exist, creates it
    * and writes the initial headers on it.
    */
    public static void newContact() {
        Console c = System.console();

        try {
        File contacts = new File("ContactList.csv"); //creates a new File object

        if (contacts.exists()) { //check if ContactList already exists
            System.out.println("Contacts file already exists.");

        } else {

            contacts.createNewFile();  //creates a new file from the object
            //Open writer for the created file
            FileWriter writer = new FileWriter(contacts, true);
            BufferedWriter bw = new BufferedWriter(writer);

            //Write the initial headers to file add a new line after
            bw.write("personal id, first name, last name, phone number, address, e-mail,");
            bw.newLine();
            bw.close();

            System.out.println("Created a new contacts file with headers.");
        }

        } catch (Exception e) {
                e.getStackTrace();
        }
    }
    /**
    * Validates and writes user-input to a file.
    *
    * Asks the user for input and
    * ensures that the input is a maximum of six comma-separated values.
    * Writes the String to a previously created file.
    */
    public static void writeContact() {
        Console c = System.console();

        System.out.println("Write your contact-list entry. Separate the values with commas:");
        while (0 < 1) {
        System.out.println
        ("personal id, first name, last name, phone number,address, e-mail");
        String contact = c.readLine();
        //looks for 4 and 6 numbers separated by A or -, Any characters, any characters,
        //+ and ten numbers, any char and one number, any characters @ and dot.
        String validate ="^\\s*\\d{6}(A|-)\\d{4},\\s*[A-Za-z]+,\\s*[A-Za-z]+,\\s*\\+\\d{10},(\\s*[A-Za-z]+\\s*\\d+,)*(\\s*[A-Za-z]+@[A-Za-z]+\\.[a-zA-Z]+)*$";

        if (Pattern.matches(validate, contact)) {
            try {
            // Creates a Writer using FileWriter
            FileWriter writer = new FileWriter("ContactList.csv", true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(contact);
            bw.newLine();

            bw.close();

            System.out.println("Contact was written to ContactList.csv -file.");
            } catch (Exception e) {
            e.getStackTrace();
            }
            break;
        } else {
            System.out.println("Please enter MAX 6 comma separated values");
            System.out.println("Finnish social security number and Phone number in international format (+358)");
        }
        }
    }
}
