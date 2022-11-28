package com.employee.employeeApplication.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

// @Entity says that this class can be converted to table and being processed.
@Entity
public class Employee {

    // @Id annotation declare that employeeId is the primary key in the DB table.
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    int employeeId;
    String employeeName;
    String employeeCity;


    @OneToOne(cascade = CascadeType.ALL)
    private Spouse spouse;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;
    public Employee() {

    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> projects;


    public Employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public Spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public void addProject(Project project) {
        this.projects.add(project);
        project.getEmployees().add(this);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
        project.getEmployees().remove(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
