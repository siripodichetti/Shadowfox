import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "👤 Name: " + name + " | 📞 Phone: " + phone + " | 📧 Email: " + email;
    }
}

public class ContactManagementSystem {
    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== 📇 Contact Management System ===");
            System.out.println("1 Add Contact");
            System.out.println("2 View All Contacts (Sorted)");
            System.out.println("3 Update Contact");
            System.out.println("4 Delete Contact");
            System.out.println("5 Exit");
            System.out.println("6 Search Contact by Name");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("👋 Exiting... Thank you!");
                case 6 -> searchContact();
                default -> System.out.println("⚠️ Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        String phone;
        do {
            System.out.print("Enter phone (10 digits): ");
            phone = input.nextLine();
            if (!isValidPhone(phone)) System.out.println("❌ Invalid phone number. Try again.");
        } while (!isValidPhone(phone));

        String email;
        do {
            System.out.print("Enter email: ");
            email = input.nextLine();
            if (!isValidEmail(email)) System.out.println("❌ Invalid email. Try again.");
        } while (!isValidEmail(email));

        contacts.add(new Contact(name, phone, email));
        System.out.println(" Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("📭 No contacts available.");
        } else {
            // Sort alphabetically by name
            Collections.sort(contacts, Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));
            System.out.println("\n--- Contact List (Sorted Alphabetically) ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    private static void updateContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter contact number to update: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < contacts.size()) {
            String phone;
            do {
                System.out.print("Enter new phone (10 digits): ");
                phone = input.nextLine();
                if (!isValidPhone(phone)) System.out.println("❌ Invalid phone number. Try again.");
            } while (!isValidPhone(phone));

            String email;
            do {
                System.out.print("Enter new email: ");
                email = input.nextLine();
                if (!isValidEmail(email)) System.out.println("❌ Invalid email. Try again.");
            } while (!isValidEmail(email));

            contacts.get(index).setPhone(phone);
            contacts.get(index).setEmail(email);
            System.out.println("🔄 Contact updated successfully!");
        } else {
            System.out.println("❌ Invalid contact number.");
        }
    }

    private static void deleteContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter contact number to delete: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("🗑️ Contact deleted successfully!");
        } else {
            System.out.println("❌ Invalid contact number.");
        }
    }

    private static void searchContact() {
        if (contacts.isEmpty()) {
            System.out.println("📭 No contacts available to search.");
            return;
        }

        System.out.print("Enter name to search: ");
        String searchName = input.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("\n--- Search Results ---");
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(searchName)) {
                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No contacts found with the name: " + searchName);
        }
    }

    // Validation methods
    private static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }

    private static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
