import java.io.Console;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* The class ReadFile contains methods for parsing the created csv-file.
*
* The methods read the created csv file and compile the data to an ArrayList.
* This ArrayList is then used for printing the information on the console,
* editing and deleting entries from it. The methods in this class
* do not take parameters or return anything.
*
* @author Aalo Kuuspalo
*/

public class ReadFile {
    /**
    * Reads a file and prints it's contents on the console.
    *
    * Reads a specified file and prints all of the content on it
    * to the System console.
    */
    public static void readContact() {
        try {
            System.out.println("Here are the entries in your contacts-list");
            Scanner sc = new Scanner(new File("ContactList.csv"));
            ArrayList<String> entries = new ArrayList<String>();
            while (sc.hasNextLine()) {
                entries.add(sc.nextLine());
            }

            for (int i = 0; i < entries.size(); i++) {
                System.out.println(entries.get(i));
            }
            sc.close();

            } catch (Exception e) {
                e.printStackTrace();
        }
    }
    /**
    * Reads a file and writes user input in it.
    *
    * Reads a specified file and prints all of the content on it
    * to the System console. Takes user input and writes it on the file.
    */
    public static void editContact() {

        Console c = System.console();
        try {
        Scanner sc = new Scanner(new File("ContactList.csv"));

        ArrayList<String> entries = new ArrayList<String>();
        while (sc.hasNextLine()) {
            entries.add(sc.nextLine());
        }

        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i));

        }
        System.out.println("Choose the entry you want to edit (1-10)");
        int y = Integer.parseInt(c.readLine());

        System.out.println("Write your contact-list entry. Separate the entries with commas:");

        while (0 < 1) {
        System.out.println("personal id, first name, last name, phone number,address, e-mail");
        String contact = c.readLine();
        String validate ="^\\s*\\d{6}(A|-)\\d{4},\\s*[A-Za-z]+,\\s*[A-Za-z]+,\\s*\\+\\d{10},(\\s*[A-Za-z]+\\s*\\d+,)*(\\s*[A-Za-z]+@[A-Za-z]+\\.[a-zA-Z]+)*$";
            if (Pattern.matches(validate, contact)) {
                entries.set(y,contact);
                System.out.println(entries.get(y));

                FileWriter writer = new FileWriter("ContactList.csv");
                BufferedWriter bw = new BufferedWriter(writer);

                for (int i = 0; i < entries.size(); i++) {
                    bw.write(entries.get(i));
                    bw.newLine();
                }

                bw.close();
                System.out.println("Data is written to the file.");
                sc.close();
                break;
            
            } else {
                System.out.println("Please enter MAX 6 comma separated values");
                System.out.println("Finnish social security number and Phone number in international format (+358)");
            }
        }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
    * Deletes information from a file.
    *
    * Takes user input and deletes information from a
    * specified file based on it.
    */
    public static void deleteContact() {

        Console c = System.console();

        try {
        Scanner sc = new Scanner(new File("ContactList.csv"));
        ArrayList<String> entries = new ArrayList<String>();
        while (sc.hasNextLine()) {
            entries.add(sc.nextLine());
        }
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i));
        }

        System.out.println("Choose the entry you want to delete (1-10)");
        int y = Integer.parseInt(c.readLine());

        entries.remove(y);
        System.out.println(entries);

        FileWriter writer = new FileWriter("ContactList.csv");
        BufferedWriter bw = new BufferedWriter(writer);

        for (int ii = 0; ii < entries.size(); ii++) {
           bw.write(entries.get(ii));
           bw.newLine();
        }

        bw.close();

        System.out.println("Data is written to the file.");
        sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
