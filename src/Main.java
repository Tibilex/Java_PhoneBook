import java.util.Scanner;
import PhoneBook.*;
public class Main {
    public static final PhoneBook phoneBook = new PhoneBook();
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        // Starting Contacts
        phoneBook.category = new ContactCategory();
        phoneBook.category.contacts.add(new Contact("Mother", 123456789, "Family"));
        phoneBook.category.contacts.add(new Contact("Boss", 123456789, "Work"));
        phoneBook.category.contacts.add(new Contact("Pizza", 123456789, "Other"));

        menu();
    }

    static void menu(){
        String menuChoice;

        while (true){
            try {
                System.out.print("""

                        \t\t  Menu
                        |=====================|
                        | 1 = Add Contact\t  |
                        | 2 = Show All\t\t  |
                        | 3 = Show 1 category |
                        | 4 = Delete contact  |
                        | 5 = Edit contact\t  |
                        | 0 = Exit:\t\t\t  |
                        |=====================|
                        """);
                menuChoice = console.nextLine();
                switch (menuChoice) {
                    case "1":
                        phoneBook.addContact();
                        break;
                    case "2":
                        System.out.print("You choice show all contacts\n");
                        phoneBook.category.showAllContacts();
                        break;
                    case "3":
                        System.out.print("You choice show all contacts in category\n");
                        System.out.print("Choice Category:\n1: Family\n2: Work\n3: Other\n");
                        String category = console.nextLine();
                        phoneBook.category.showAllContactsInCategory(category);
                        break;
                    case "4":
                        phoneBook.deleteContact();
                        break;
                    case "5":
                        phoneBook.editContact();
                        break;
                    case "0": {return;}
                    default : System.out.println("\n\tInvalid Input !");
                }
            }
            catch (Exception exception){
                System.out.println("\n\tException is :" + exception.getMessage());
            }
        }
    }

}