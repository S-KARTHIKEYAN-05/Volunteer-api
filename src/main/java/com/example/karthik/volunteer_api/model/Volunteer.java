package com.example.karthik.volunteer_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "volunteers")
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gmail;
    private String branch;
    private String year;
    private String gender;
    private String section;

    // Constructors
    public Volunteer() {}

    public Volunteer(String name, String gmail, String branch, String year, String gender, String section) {
        this.name = name;
        this.gmail = gmail;
        this.branch = branch;
        this.year = year;
        this.gender = gender;
        this.section = section;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGmail() { return gmail; }
    public void setGmail(String gmail) { this.gmail = gmail; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
}
