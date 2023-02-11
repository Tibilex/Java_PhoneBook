package PhoneBook;

import java.util.Objects;

public class Contact {
    protected String contactName;
    protected int contactNumber;
    protected String contactCategory;
    protected ContactCategory categories;

    public Contact() {}
    public Contact(String name, int number, String category) {
        this.contactName = name;
        this.contactNumber = number;
        this.contactCategory = category;

    }

    public String getContactName() {
        return contactName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getContactCategory() {
        return contactCategory;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setContactCategory(String category) {
        this.contactCategory = category;
    }

    public String contactToString() {
        return "Name: " + "\"" + this.contactName + "\"" + " Phone: " + "\"" + this.contactNumber + "\"" + "\n";
    }

    public String contactWithCategoryToString() {
        return "Name: " + "\"" + this.contactName + "\"" + " Phone: " + "\"" + this.contactNumber + "\"" + " Category: " + "\"" + this.contactCategory + "\"" +"\n";
    }
}



