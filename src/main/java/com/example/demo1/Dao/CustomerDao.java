package com.example.demo1.Dao;

public class CustomerDao {

    //name
    //email
    //password

    //job
    //facebookName

    //date

    private int id;
    private String name;
    private String email;
    private String password;
    private String job;
    private String facebookName;
    private String date;

    public CustomerDao() {
    }

    public CustomerDao(int id, String name, String email, String password, String job, String facebookName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.job = job;
        this.facebookName = facebookName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }
}
