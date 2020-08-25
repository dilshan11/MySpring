package com.example.demo1.Dao;

public class CustomerDetailsDao {

    //id
    //job
    //facebookName

    private int id;
    private String job;
    private String facebookName;

    public CustomerDetailsDao() {
    }

    public CustomerDetailsDao(String job, String facebookName) {
        this.job = job;
        this.facebookName = facebookName;
    }

    public CustomerDetailsDao(int id, String job, String facebookName) {
        this.id = id;
        this.job = job;
        this.facebookName = facebookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CustomerDetailsDao{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", facebookName='" + facebookName + '\'' +
                '}';
    }
}
