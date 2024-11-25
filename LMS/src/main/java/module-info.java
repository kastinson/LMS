/**
 * This is the module descriptor for the Library Management System (LMS) application.
 * It defines the modules and packages required for the application to function.
 */
module com.example.lms {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.lms to javafx.fxml;
    exports com.example.lms;
}