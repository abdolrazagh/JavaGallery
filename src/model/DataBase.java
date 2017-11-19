package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    Connection connection;

    public DataBase(){
        try {
            connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean connect () throws Exception{
        if (connection != null){
            return true;
        }
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javagallery","root","13708");
        return true;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
