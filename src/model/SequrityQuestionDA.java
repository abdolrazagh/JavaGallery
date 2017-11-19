package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SequrityQuestionDA {

    public SequrityQuestion getQuestionById(int id) {
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql = "SELECT * FROM sequrityquestions WHERE id = ?";

        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                SequrityQuestion sq = new SequrityQuestion(result.getInt("id"), result.getString("question"));
                return sq;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<SequrityQuestion> getAllQuestions(){
        DataBase dataBase = new DataBase();
        Connection c = dataBase.connection;
        PreparedStatement stmt;
        String sql = "SELECT * FROM sequrityquestions";
        try {
            stmt = c.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            ArrayList<SequrityQuestion> res = new ArrayList<>();
            while (result.next()){
                SequrityQuestion sq = new SequrityQuestion(result.getInt("id"), result.getString("question"));
                res.add(sq);
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}

