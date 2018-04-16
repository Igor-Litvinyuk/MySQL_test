package com.mySQL.databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    //private final static String URL = "jdbc:mysql://localhost:3306/mydatabasetest";
    private final static String URLFIXED = "jdbc:mysql://localhost:3306/mydatabasetest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URLFIXED, USERNAME, PASSWORD);
            Statement statement = connection.createStatement()){
//            statement.execute("insert into users(id, name, age, email) values (6, 'Anna', 19, 'anna@gmail.com')");
//            statement.executeUpdate("update users set name = 'new Name' where id = 5");
//            statement.addBatch("insert into users(name, age, email) values ('Maria', 24, 'maria@gmail.com')");
//            statement.addBatch("insert into users(name, age, email) values ('Ivan', 27, 'ivan@gmail.com')");
//            statement.addBatch("insert into users(name, age, email) values ('Vova', 25, 'vova@gmail.com')");
//            statement.executeBatch();
//            statement.clearBatch();
            boolean status = statement.isClosed();
            System.out.println(status);
//            statement.getConnection();
        }
    }
}
