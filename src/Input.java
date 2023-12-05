import java.io.Console;
import java.io.File;
import java.io.FileWriter;
public class Input {
    public static final String CREATE_CONTACT = "Create a new entry";
    public static final String READ_CONTACT = "Read an entry";
    public static final String UPDATE_CONTACT = "Update an entry";
    public static final String DELETE_CONTACT = "Delete an entry";
    public static final String ERROR = "Please enter a valid number from 1-4";
    
    public static String commandInput(int x) {
        Console c = System.console();
        
        if (x==1) {
            CreateFile.newContact();
            return CREATE_CONTACT;
        } else if (x==2) {
            return READ_CONTACT;
        } else if (x==3) {
            return UPDATE_CONTACT;
        } else if (x==4) {
            return DELETE_CONTACT;
        }else {
            return ERROR;
        }
    }

}