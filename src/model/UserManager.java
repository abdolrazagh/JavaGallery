package model;

public class UserManager {

    public User loadById (int id){
        UserDA userDA = new UserDA();
        return userDA.selectByID(id);
    }

    public boolean saveUser (User usr){
        UserDA userDA = new UserDA();
        return userDA.insertUser(usr);
    }
}
