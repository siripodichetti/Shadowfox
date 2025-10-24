# Simple Contact Management System
 
## Project Review

SimpleContactSystem is a console-based Java application that helps you manage personal contacts with ease. With a simple menu-driven interface, users can add, view, update, delete, and search contacts quickly.

This project is great for learning basic CRUD operations, working with ArrayLists, and handling user input in Java.

### Features

➕ Add Contact – Save a person’s name, phone number, and email.

📜 View All Contacts – See all your contacts in alphabetical order.

✏️ Update Contact – Quickly change a contact’s phone number or email.

❌ Delete Contact – Remove contacts you no longer need.

🔍 Search by Name – Find anyone in seconds.

🚪 Exit Program – Close the app safely when done.

✅ Validation – Ensures phone numbers are 10 digits and emails are correctly formatted.


### How to Run

1. Open terminal/VS Code and navigate to project folder:
 
   cd SimpleContactSystem

2. Compile the Java program:

    javac ContactManagementSystem.java

3. Run the program:

    java ContactManagementSystem

4. Follow the on-screen menu to add, view, search, update, or delete contacts.



### Sample Data 

| S.No | Name   | Phone      | Email                                           |
| ---- | ------ | ---------- | ----------------------------------------------- |
| 1    | Rahul  | 9876543210 | [rahul@gmail.com](mailto:rahul@gmail.com)       |
| 2    | Alice  | 9123456780 | [alice@example.com](mailto:alice@example.com)   |
| 3    | Sneha  | 9988776655 | [sneha123@gmail.com](mailto:sneha123@gmail.com) |
| 4    | Vikram | 9871234560 | [vikram@domain.com](mailto:vikram@domain.com)   |
| 5    | Priya  | 9012345678 | [priya.p@gmail.com](mailto:priya.p@gmail.com)   |
| 6    | Aman   | 9898989898 | [aman@yahoo.com](mailto:aman@yahoo.com)         |
| 7    | Meera  | 9765432109 | [meera@mail.com](mailto:meera@mail.com)         |
| 8    | Karan  | 9123987654 | [karan@domain.com](mailto:karan@domain.com)     |
| 9    | Sonia  | 9876678899 | [sonia@gmail.com](mailto:sonia@gmail.com)       |
| 10   | Rohan  | 9988771122 | [rohan@abc.com](mailto:rohan@abc.com)           |
| 11   | Nisha  | 9001122334 | [nisha@example.com](mailto:nisha@example.com)   |
| 12   | Arjun  | 9874501236 | [arjun@mail.com](mailto:arjun@mail.com)         |
| 13   | Tanya  | 9123456789 | [tanya@domain.com](mailto:tanya@domain.com)     |
| 14   | Dev    | 9988997766 | [dev@gmail.com](mailto:dev@gmail.com)           |


### Sample Run 

=== Contact Management System ===

1️⃣ Add Contact

2️⃣ View All Contacts (Sorted)

3️⃣ Update Contact

4️⃣ Delete Contact

5️⃣ Exit

6️⃣ Search Contact by Name
Enter your choice: 1

Enter name: Rahul

Enter phone (10 digits): 9876543210

Enter email: rahul@gmail.com

✅ Contact added successfully!

Enter your choice: 1

Enter name: Alice

Enter phone (10 digits): 9123456780

Enter email: alice@example.com

✅ Contact added successfully!

Enter your choice: 2

--- Contact List (Sorted Alphabetically) ---

1. Name: Alice | Phone: 9123456780 | Email: alice@example.com
2. Name: Rahul | Phone: 9876543210 | Email: rahul@gmail.com

Enter your choice: 6

Enter name to search: rah

--- Search Results ---

Name: Rahul | Phone: 9876543210 | Email: rahul@gmail.com

Enter your choice: 3

Enter contact number to update: 1

Enter new phone (10 digits): 9123456789

Enter new email: alice@domain.com

🔄 Contact updated successfully!

Enter your choice: 4

Enter contact number to delete: 2

🗑️ Contact deleted successfully!

Enter your choice: 2

--- Contact List (Sorted Alphabetically) ---

1. Name: Alice | Phone: 9123456789 | Email: alice@domain.com

Enter your choice: 5

👋 Exiting... Thank you!

### Test Cases  

 Test Case                      | Input                                                                                          | Expected Output                          | Notes                         |
| ------------------------------ | ---------------------------------------------------------------------------------------------- | ---------------------------------------- | ----------------------------- |
| Add valid contact              | Name: Rahul, Phone: 9876543210, Email: [rahul.sharma@gmail.com](mailto:rahul.sharma@gmail.com) | ✅ Contact added successfully             | Pass                          |
| Add invalid phone              | Phone: 1234                                                                                    | ❌ Invalid phone number                   | Must retry until 10 digits    |
| Add invalid email              | Email: alice.gmail.com                                                                         | ❌ Invalid email                          | Must retry until valid format |
| View all contacts              | N/A                                                                                            | Contacts displayed sorted alphabetically | Pass                          |
| Update contact phone/email     | Update contact 3                                                                               | Updated contact displayed correctly      | Pass                          |
| Delete contact                 | Delete contact 5                                                                               | Contact removed from list                | Pass                          |
| Search contact by full name    | Search: “Meera Reddy”                                                                          | Contact displayed                        | Exact match                   |
| Search contact by partial name | Search: “Simran”                                                                               | Contact displayed                        | Partial match                 |
| Search contact no match        | Search: “Zara”                                                                                 | ❌ No contacts found                      | Pass                          |
| Exit program                   | Choice 5                                                                                       | Program exits                            | Pass                          |
| Add duplicate contact          | Name: Rahul Sharma                                                                             | Contact added again                      | Pass, duplicates allowed      |
| View empty list                | No contacts yet                                                                                | 📭 No contacts available                 | Pass                          |
| Update invalid number          | Enter 50                                                                                       | ❌ Invalid contact number                 | Pass                          |
| Delete invalid number          | Enter 100                                                                                      | ❌ Invalid contact number                 | Pass                          |
| Add contact phone letters      | Phone: 9876abcd12                                                                              | ❌ Invalid phone number                   | Must retry                    |
| Add contact email no @         | Email: abc.com                                                                                 | ❌ Invalid email                          | Must retry                    |
| Add contact email no domain    | Email: abc@com                                                                                 | ❌ Invalid email                          | Must retry                    |
| Search case insensitive        | Search: “tanya bhatt”                                                                          | Contact found                            | Pass                          |
| Update phone only              | Change phone, keep email                                                                       | Updated correctly                        | Pass                          |
| Update email only              | Change email, keep phone                                                                       | Updated correctly                        | Pass                          |
