package com.pluralsight.order.util;

import java.sql.SQLException;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
       System.out.println(errorcode);
        System.out.println(SQLstate);
        System.out.println(ex);
        //                Finally, call the method that prints the exception's stack trace to the console.

    }
}
