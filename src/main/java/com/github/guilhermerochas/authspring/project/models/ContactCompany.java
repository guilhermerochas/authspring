package com.github.guilhermerochas.authspring.project.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contact_company")
public class ContactCompany {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    @Size(min = 0, max = 50)
    @NotNull
    private String companyName;

    @Column(name = "company_owner")
    @Size(min = 0, max = 50)
    @NotNull
    private String companyOwner;

    @Column(name = "company_website")
    @Size(min = 0, max = 50)
    @Null
    private String companyWebsite;

    @Column(name = "company_location")
    @Size(min = 0, max = 50)
    @NotNull
    private String companyLocation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }
}
