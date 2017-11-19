package model;

import java.util.ArrayList;

public class SequrityQuestionManager {

    public SequrityQuestion loadOneQuestion(int id){
        SequrityQuestionDA da = new SequrityQuestionDA();
        return da.getQuestionById(id);
    }

    public ArrayList<SequrityQuestion> loadAllQuestions(){
        SequrityQuestionDA da = new SequrityQuestionDA();
        return da.getAllQuestions();
    }

}
