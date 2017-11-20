package model;

import java.util.ArrayList;

public class SequrityQuestionManager {

    public static SequrityQuestion loadOneQuestion(int id){
        SequrityQuestionDA da = new SequrityQuestionDA();
        return da.getQuestionById(id);
    }

    public static ArrayList<SequrityQuestion> loadAllQuestions(){
        SequrityQuestionDA da = new SequrityQuestionDA();
        return da.getAllQuestions();
    }

}
