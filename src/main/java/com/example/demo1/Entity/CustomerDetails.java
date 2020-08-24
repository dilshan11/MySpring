package com.example.demo1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
    //id
    //job
    //facebookName
    //customer
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String job;
    private String facebookName;

    @OneToOne(mappedBy = "customerDetails")
    private Customer customer;

    public CustomerDetails() {
    }

    public CustomerDetails(String job, String facebookName) {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", facebookName='" + facebookName + '\'' +
                '}';
    }
}
