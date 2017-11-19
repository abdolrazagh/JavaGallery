package model;

public class Picture {
    private int id;
    private int catId;
    private String address;
    private int status;

    public Picture() {
    }

    public Picture(int id, int catId, String address, int status) {
        this.id = id;
        this.catId = catId;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
