package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryDA {

    public ArrayList<Category> selectAllCategories(){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt ;
        ArrayList<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM category";
        try {
            stmt =c.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                Category category = new Category(result.getInt("id"),result.getString("name"));
                categories.add(category);
            }
            return categories;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Category selectCategoryById(int id){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt ;
        String sql = "SELECT * FROM user WHERE id = ?";
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                Category category = new Category(result.getInt("id"),result.getString("name"));
                return category;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
