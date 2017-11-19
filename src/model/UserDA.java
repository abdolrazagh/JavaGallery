package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDA {

    public User selectByID (int id){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql ="SELECT * FROM user WHERE USER_ID = ?";
        try {
            stmt=c.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                User user = new User();
                user.setId(result.getInt("USER_ID"));
                user.setUsername(result.getString("USRNAME"));
                user.setPassword(result.getString("PASSWORD"));
                user.setName(result.getString("NAME"));
                user.setFamily(result.getString("FAMILY"));
                user.setRole(result.getString("role"));
                user.setSq1(result.getInt("SQ_ID1"));
                user.setAns1(result.getString("ANS1"));
                user.setSq2(result.getInt("SQ_ID2"));
                user.setAns2(result.getString("ANS2"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public  boolean insertUser(User usr){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        boolean rsltchk = false;
        String sql = "INSERT INTO user (`USERNAME`, `PASSWORD`, `NAME`, `FAMILY`, `SQ_ID1`, `ANS1`, `SQ_ID2`, `ANS2`, `role`) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            stmt = c.prepareStatement(sql);
            stmt.setString(1,usr.getUsername());
            stmt.setString(2,usr.getPassword());
            stmt.setString(3,usr.getName());
            stmt.setString(4,usr.getFamily());
            stmt.setInt(5,usr.getSq1());
            stmt.setString(6,usr.getAns1());
            stmt.setInt(7,usr.getSq2());
            stmt.setString(8,usr.getAns2());
            stmt.setString(9,usr.getRole());
            stmt.executeUpdate();
            rsltchk = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return rsltchk;
    }
}
