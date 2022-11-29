package com.employee.employeeApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String lineOne;
    private String city;

    @JsonIgnore
    @ManyToOne
    private Employee employee;

    public Address() {
    }

    public Address(String line1, String city1, String conutry1, int i) {
        this.lineOne = line1;
        this.city = city1;
        this.country = conutry1;
        this.zip = i;
    }

    public Address(String lineOne, String city, String country, int zip, Employee employee) {
        this.lineOne = lineOne;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.employee = employee;
    }


    public int getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    private String country;
    private int zip;



}
