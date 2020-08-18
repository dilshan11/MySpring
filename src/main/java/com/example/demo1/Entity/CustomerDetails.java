package com.example.demo1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
    //email
    //faceBookName
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String email;
    private String faceBookName;

    public CustomerDetails() {
    }

    public CustomerDetails(String email, String faceBookName) {
        this.email = email;
        this.faceBookName = faceBookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", faceBookName='" + faceBookName + '\'' +
                '}';
    }
}
