import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CreateFile {
    
    public static void newContact() {
        Console c = System.console();
        
        try {
        File contacts = new File("ContactList.csv");
        
        
        if (contacts.exists()) {
            System.out.println("Contacts file already exists.");
        
        } else {
            
            contacts.createNewFile();
            
            FileWriter writer = new FileWriter(contacts, true); //Open writer for the created file
            BufferedWriter bw = new BufferedWriter(writer);
            
            bw.write("personal id, first name, last name, phone number, address, e-mail,"); //Write the initial headers to the contacts-file
            
            bw.close();
           
            System.out.println("Created a new contacts file with headers.");
        }
        
        } catch(Exception e) {
                e.getStackTrace();
        }   
        
    } 
}