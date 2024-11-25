package com.example.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Kelly Stinson
 * Course: CEN-3024C-14320 Software Development I
 * @since : 11-16-2024
 * Class: DatabaseConnector
 *
 * Provides functionality to establish a connection to a MySQL database.
 *
 * The {@code DatabaseConnector} class is responsible for managing the database
 * connection using the MySQL JDBC driver. It retrieves the database connection
 * details (URL, username, and password) from the {@link DatabaseConfiguration} class
 * and uses them to establish a connection. The class handles exceptions that
 * may occur during the connection process and ensures that the appropriate error
 * messages are logged.
 *
 * Usage example:
 * <pre>
 * {@code
 * Connection connection = DatabaseConnector.connect();
 * if (connection != null) {
 *     // Perform database operations
 * }
 * }
 * </pre>
 */
public class DatabaseConnector {

    /**
     * Establishes and returns a connection to the database using the
     * JDBC driver and credentials configured in {@link DatabaseConfiguration}.
     * <p>
     * This method registers the MySQL JDBC driver and attempts to open a connection
     * using the URL, username, and password provided by the {@link DatabaseConfiguration}.
     * If a {@code SQLException} or {@code ClassNotFoundException} occurs,
     * the error message is printed to {@code System.err}, and {@code null} is returned.
     * </p>
     *
     * @return a {@link Connection} object to the database, or {@code null} if the connection fails
     * @throws SQLException if a database access error occurs
     */
    public static Connection connect() throws SQLException {

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            var jdbcUrl = DatabaseConfiguration.getDbUrl();
            var user = DatabaseConfiguration.getDbUsername();
            var password = DatabaseConfiguration.getDbPassword();

            // Open and return a connection to the database
            return DriverManager.getConnection(jdbcUrl, user, password);

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
