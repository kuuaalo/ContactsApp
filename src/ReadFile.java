import java.io.Console;
import java.io.File;
import java.util.Scanner;

public class ReadFile{
    public static void readContact() {
            try {
            Scanner sc = new Scanner(new File("ContactList.csv")); //create new scanner to file

            while (sc.hasNextLine()) { //check if file has line values
                String line = sc.nextLine(); //reads line values
                String [] entries = line.split(",");
                for (int i=0;i<entries.length;i++) {
                    System.out.print(entries[i]);
                }
                System.out.println();  // Move to the next line for the next entry
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public static void editContact() {
        try {
            Scanner sc = new Scanner(new File("ContactList.csv")); //create new scanner to file
            String [] entries = new String [10];
            while (sc.hasNextLine()) { //check if file has line values
                String line = sc.nextLine(); //reads line values
                for (int i=0;i<entries.length;i++){
                    entries[i] += line.split(",");
                }
                System.out.println();  // Move to the next line for the next entry
            }
            System.out.println("Input the line number you want to edit (0-10)")
            int y = Integer.parseInt(c.readLine());
            System.out.println("Write your contact-list entry. Separate the entries with commas:");
            System.out.println("personal id, first name, last name, phone number,address, e-mail");
            String input = c.readLine();

            entries[y] += input;

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }     
}
