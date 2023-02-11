package PhoneBook;
import java.util.ArrayList;
import java.util.Objects;

public class ContactCategory extends Contact{

    public ArrayList<Contact> contacts = new ArrayList<Contact>();
    public String category;

    public ContactCategory(){}
    protected ContactCategory(String category){
        this.category = category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    public void showAllContacts(){
        for (Contact iter: contacts) {
            System.out.print(iter.contactWithCategoryToString());
        }
    }

    public void showAllContactsInCategory(String category){
        for (Contact iter: contacts) {
            if (Objects.equals(iter.contactCategory, category)) {
                System.out.print(iter.contactToString());
            }

        }
    }
}