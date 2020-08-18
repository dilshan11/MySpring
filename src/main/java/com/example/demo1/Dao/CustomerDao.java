package com.example.demo1.Dao;

public class CustomerDao {
    //id
    //name
    //pnumber

    private int id;
    private String name;
    private int pnumber;
    private String email;
    private String faceBookName;

    public CustomerDao() {
    }

    public CustomerDao(int id, String name, int pnumber) {
        this.id = id;
        this.name = name;
        this.pnumber = pnumber;
    }

    public CustomerDao(int id, String name, int pnumber, String email, String faceBookName) {
        this.id = id;
        this.name = name;
        this.pnumber = pnumber;
        this.email = email;
        this.faceBookName = faceBookName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBookName() {
        return faceBookName;
    }

    public void setFaceBookName(String faceBookName) {
        this.faceBookName = faceBookName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPnumber() {
        return pnumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public String toString() {
        return "CustomerDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pnumber=" + pnumber +
                '}';
    }
}
