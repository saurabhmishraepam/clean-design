package com.epam.patterns.lsp;

class DatabaseGateway {
    final static String WRITE_TO_DATABASE = "write to database";

    private static String database;

    static void writeToDBForce(PowerUser user, String message) {
        user.setupAccessRight(WRITE_TO_DATABASE, true);
        writeToDB(user, message);
    }

    static void writeToDB(PowerUser user, String message) {
        if (user.getValueOfAccessRight(WRITE_TO_DATABASE)) {
            database = message;
        }
    }

    static String readFromDB() {

        return database;
    }
}
