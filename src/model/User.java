package model;

public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    private String family;
    private String role;
    private int sq1;
    private String ans1;
    private int sq2;
    private String ans2;

    public User() {

    }

    public User( String username, String password, String name, String family, int sq1, String ans1, int sq2, String ans2, String role) {

        this.username = username;
        this.password = password;
        this.name = name;
        this.family = family;
        this.role = role;
        this.sq1 = sq1;
        this.ans1 = ans1;
        this.sq2 = sq2;
        this.ans2 = ans2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSq1() {
        return sq1;
    }

    public void setSq1(int sq1) {
        this.sq1 = sq1;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public int getSq2() {
        return sq2;
    }

    public void setSq2(int sq2) {
        this.sq2 = sq2;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }
}
