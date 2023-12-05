import java.io.Console;
import java.io.File;
import java.io.FileWriter;
public class CreateFile {
    public static void newContact() {
    
        File file = new File("ContactList.xml");

        try {
        boolean value = file.createNewFile();
        if (value) {
            System.out.println("New Contacts File was created.");
        }
        else {
            System.out.println("Contacts file already exists.");
        }
        }
        catch(Exception e) {
        e.getStackTrace();
        }
             
    }
    public static void writeContact() {
        Console c = System.console();
        System.out.println("Write your contact-list entry:");
        String contact= c.readLine();
        try {
        // Creates a Writer using FileWriter
        FileWriter output = new FileWriter("ContactList.xml");

        // Writes the program to file
        output.write(contact);
        System.out.println("Data is written to the file.");

        // Closes the writer
        output.close();
        }
        catch (Exception e) {
         e.getStackTrace();
        }
             
    }

}