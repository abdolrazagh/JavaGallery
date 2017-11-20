package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PictureDA {

    public boolean insertPicture(Picture pic) {
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql = "INSERT INTO pictures (`cat_id`,`address`,`status`) VALUES (?,?,?)";
        boolean rsltchk = false;
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, pic.getCatId());
            stmt.setString(2, pic.getAddress());
            stmt.setInt(3, pic.getStatus());
            stmt.executeUpdate();
            rsltchk = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rsltchk;
    }

    public ArrayList<Picture> selectPictureByCatId(int id) {
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        ArrayList<Picture> pictures = new ArrayList<>();
        String sql = "SELECT * FROM pictures WHERE `cat_id` = ?";
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Picture picture = new Picture(result.getInt("id"), result.getInt("cat_id"), result.getString("address"), result.getInt("status"));
                pictures.add(picture);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pictures;
    }

    public Picture selectPictureById(int id) {
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql = "SELECT * FROM pictures WHERE `id` = ?";
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                Picture picture = new Picture(result.getInt("id"), result.getInt("cat_id"), result.getString("address"), result.getInt("status"));
                return  picture;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deletePictureById  (int id){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql = "DELETE FROM pictures WHERE `id` = ?";
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
