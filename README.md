# ContactsApp
ContactsApp is an application for writing and storing contact-information on persistent text-file.

The application was made for a school java-programming course.

Build status: unknown
Code style: standard
Built with: Visual Studio Code

Features
The application can take user input from the command line and store it into a csv-file.
The stored contacts can then be edited, read or deleted with simple user input.

Code Example
try {
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

How to use?
1. Compile the application with javac ContactsApp.java.
2. Run it with java ContactsApp.
3. Input 1 to terminal and press enter to create a new file an write into it.
4. Write your contact-list entry separated with commas.
5. Input 2 to terminal to read a list of all the contacts in the file.
6. Input 3 to edit a contact entry. Choose the entry you want to edit with 1-10.
7. Input 4 to delete a contact entry. Choose the entry with 1-10.
8. Input 5 to quit the program.

Link to video
https://www.youtube.com/playlist?list=PLgJRNipDHeyp8-VSIR3mFJKcW8B_WYpXG




