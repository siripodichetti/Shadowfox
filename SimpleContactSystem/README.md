## Sample Run

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
