import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFile{
    public static void writeContact() {
        Console c = System.console();
        
       
        System.out.println("Write your contact-list entry. Separate the entries with commas:");
        System.out.println("personal id, first name, last name, phone number,address, e-mail");
        String contact= c.readLine();

        try {
        // Creates a Writer using FileWriter
        FileWriter writer = new FileWriter("ContactList.csv", true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.newLine();
        bw.write(contact);
        
        bw.close();
        
        System.out.println("Data is written to the file.");

        // Closes the writer
        
        }
        catch (Exception e) {
        e.getStackTrace();
        }     
        
    }
    
}