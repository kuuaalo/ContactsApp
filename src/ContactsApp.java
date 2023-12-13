import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactsApp {
    public static void main (String [] args) {
        Console c = System.console();
        System.out.println("Welcome to ContactsApp");
        System.out.println("[create] press 1 to create new entry");
        System.out.println("[read] press 2 to read an entry");
        System.out.println("[update] press 3 to update an entry");
        System.out.println("[delete] press 4 to delete an entry");
        String command = Input.commandInput(Integer.parseInt(c.readLine()));
            System.out.println(command);
        
    }


}