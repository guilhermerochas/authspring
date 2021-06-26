package com.github.guilhermerochas.authspring.project.controllers;

import com.github.guilhermerochas.authspring.project.models.ContactCompany;
import com.github.guilhermerochas.authspring.project.services.ContactCompanyService;
import com.github.guilhermerochas.authspring.project.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
    @Autowired
    private ContactCompanyService service;

    @GetMapping()
    public ResponseEntity getCompanies() {
        try {
            return new ResponseEntity<List<ContactCompany>>(service.getAllContactCompanies(), HttpStatus.OK);
        } catch (Exception e) {
            return HttpUtils.errorResultUtil(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getSingleCompany(@PathVariable Integer id) {
        try {
            Optional<ContactCompany> companyOptional = service.getSingleCompany(id);

            return companyOptional.map((company) -> {
                return new ResponseEntity<ContactCompany>(company, HttpStatus.OK);
            }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e){
            return HttpUtils.errorResultUtil(e);
        }
    }
}
