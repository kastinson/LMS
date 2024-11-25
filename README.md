# Library Management System (LMS)

The **Library Management System (LMS)** is a Java-based application designed to streamline library operations. With its user-friendly graphical interface built using JavaFX and robust database integration via MySQL, the LMS provides a comprehensive solution for managing book inventories, checkouts, and check-ins.

---

## Features
### Core Functionalities
- **Add Books**: Add new books to the library with details like title, author, genre, and status.
- **Remove Books**: Delete books using their barcode or title.
- **Check Out Books**: Update the status to "Checked Out" and assign a due date (4 weeks from checkout).
- **Check In Books**: Mark books as "Checked In" and clear the due date.
- **View Book Inventory**: Display a sortable table of all books with real-time updates.
- **File Import**: Load book data from a CSV file for bulk additions.
- **Database Integration**: Perform CRUD operations on a MySQL database for reliable data persistence.

### GUI Highlights
- Intuitive navigation through multiple views:
  - Main Dashboard
  - Add Book Form
  - View All Books
- Real-time feedback for operations (e.g., success and error alerts).
- Responsive, interactive table for book inventory.

---

## Project Structure
### **Model-View-Controller (MVC) Architecture**
- **Model**: Represents data and business logic.
  - `Book.java`: Book entity with attributes and methods.
  - `BookService.java`: Manages operations such as adding, removing, and checking books in or out.
  - `BookDAO.java`: Handles database queries and updates.
  - `DatabaseConnector.java`: Establishes connections to the MySQL database.
- **View**: JavaFX-based user interface defined in FXML files:
  - `MainView.fxml`: Main dashboard layout.
  - `AddBookView.fxml`: Form layout for adding new books.
  - `ViewBooks.fxml`: Table view for displaying the book inventory.
- **Controller**: Manages user interactions and updates models/views.
  - `MainController.java`: Handles navigation and main dashboard actions.
  - `AddBookController.java`: Controls the Add Book form.
  - `ViewBooksController.java`: Manages the table view for displaying all books.

---

## Requirements
### System Requirements
- **Java JDK**: Version 17 or higher
- **JavaFX SDK**: Required for GUI components
- **MySQL Server**: Database backend
- **CSV File**: For bulk data import

### Libraries and Tools
- **JavaFX**: Used for building the GUI.
- **MySQL Connector/J**: Enables database connectivity.

---

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-management-system.git
   ```
2. Import the project into an IDE (e.g., IntelliJ IDEA, Eclipse).
3. Set up JavaFX in your build environment.
4. Configure MySQL credentials in `DatabaseConfiguration.java`.
5. Initialize the database using the schema provided below:
   ```sql
   CREATE TABLE books (
       id INT AUTO_INCREMENT PRIMARY KEY,
       barcode VARCHAR(255) NOT NULL UNIQUE,
       title VARCHAR(255) NOT NULL,
       author VARCHAR(255),
       genre VARCHAR(255),
       status VARCHAR(50) DEFAULT 'Checked In',
       due_date DATE DEFAULT NULL
   );
   ```
6. Build and run the project:
   ```bash
   ./gradlew run
   ```

---

## Usage
### Dashboard
- Navigate to different sections like "Add Book," "View All Books," or "Check Out/In."

### Add a Book
1. Open the Add Book form.
2. Enter book details.
3. Submit to add the book to the database.

### View Books
- Displays all books in a sortable table.

### Check Out/In
1. Select "Check Out" or "Check In" from the main menu.
2. Enter the book's barcode or title to perform the action.

### Import from File
1. Select "Load Books from File."
2. Choose a CSV file to upload and populate the database.

---

## Contributors
- **Kelly Stinson** (Developer)

---

## Contact

For any queries, feel free to reach out to:
- **GitHub**: [Kelly Stinson](https://github.com/kastinson)

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Possible Future Enhancements
- Role-based access control for multiple user types.
- Overdue notifications for borrowed books.
- Export book data to CSV format.
