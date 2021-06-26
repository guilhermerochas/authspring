package com.github.guilhermerochas.authspring.project.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Table(name = "user_contact")
@Entity
public class UserContact {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    @Size(min = 0, max = 50)
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 0, max = 50)
    @NotNull
    private String lastName;

    @Column(name = "email")
    @Size(min = 0, max = 50)
    @Null
    private String email;

    @Column(name = "gender")
    @Size(min = 0, max = 50)
    @NotNull
    private String gender;

    @Column(name = "company_id")
    @Null
    private Integer companyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
