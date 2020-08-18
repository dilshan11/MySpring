package com.example.demo1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customer_table")
public class Customer {
    //id
    //name
    //pnumber
    //customerDetails
    @Id
    private int id;
    private String name;
    private int pnumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_Details_Id")
    private CustomerDetails customerDetails;

    public Customer() {
    }

    public Customer(String name, int pnumber) {
        this.name = name;
        this.pnumber = pnumber;
    }

    public Customer(int id, String name, int pnumber) {
        this.id = id;
        this.name = name;
        this.pnumber = pnumber;
    }

    public Customer(int id, String name, int pnumber, CustomerDetails customerDetails) {
        this.id = id;
        this.name = name;
        this.pnumber = pnumber;
        this.customerDetails = customerDetails;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
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

    public int getPnumber() {
        return pnumber;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pnumber=" + pnumber +
                ", customerDetails=" + customerDetails +
                '}';
    }
}
