package PhoneBook;

import java.util.Objects;
import java.util.Scanner;

public class PhoneBook {
    public ContactCategory category = new ContactCategory();
    public static Scanner console = new Scanner(System.in);

    public void addContact() {
        System.out.print("\nEnter name: ");
        String name = console.nextLine();
        System.out.print("Enter number: ");
        String number = console.nextLine();
        System.out.print("Choice Category:\n1 Family\n2 Work\n3 Other\n");
        String category = console.nextLine();
        this.category.contacts.add(new Contact(name, Integer.parseInt(number), category));
        System.out.print("\nSuccessfully added: ");
    }

    public void deleteContact(){
        if (ContactsAvailableCheck()){

            System.out.print("\nEnter contact name: ");
            String name = console.nextLine();
            for (Contact iter: category.contacts){
                if (Objects.equals(iter.getContactName(), name)){
                    category.contacts.remove(iter);
                    System.out.print("\nDelete successful: ");
                    break;
                }
                else {
                    System.out.print("\n Contact not found");
                }
            }
        }
        else {
            System.out.print("\n Phonebook is empty, please add contacts to phonebook");
        }
    }

    public void editContact() {
        if (ContactsAvailableCheck()) {

            System.out.print("\nEnter contact name: ");
            String name = console.nextLine();
            Contact tmpContact = null;

            for (Contact iter : category.contacts) {
                if (Objects.equals(iter.getContactName(), name)) {
                    tmpContact = iter;
                    tmpContact.contactWithCategoryToString();
                    System.out.print("\nEnter New Name:");
                    tmpContact.setContactName(console.nextLine());
                    System.out.print("Enter New Number:");
                    tmpContact.setContactNumber(Integer.parseInt(console.nextLine()));
                    System.out.print("Choice new Category:\n1 = Family\n2 = Work\n3 = Other \n");
                    String category = console.nextLine();
                    switch (category) {
                        case "1" -> tmpContact.setContactCategory("Family");
                        case "2" -> tmpContact.setContactCategory("Work");
                        case "3" -> tmpContact.setContactCategory("Other");
                        default -> {
                        }
                    }
                    System.out.println("\nContact update successful: ");
                    tmpContact.contactWithCategoryToString();
                    break;
                }
            }
            if (tmpContact == null) {
                System.out.print("\n Contact not found");
            }
        }
        else {
            System.out.print("\n Phonebook is empty, please add contacts to phonebook");
        }
    }

    private boolean ContactsAvailableCheck(){
        return this.category.contacts != null;
    }
}

