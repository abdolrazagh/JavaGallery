package model;

public class UserManager {

    public static User loadById (int id){
        UserDA userDA = new UserDA();
        return userDA.selectByID(id);
    }

    public static boolean saveUser (User usr){
        UserDA userDA = new UserDA();
        return userDA.insertUser(usr);
    }
    public static User loadUserByUsername(String username){
        UserDA userDA = new UserDA();
        return userDA.selectByUserName(username);
    }
}
