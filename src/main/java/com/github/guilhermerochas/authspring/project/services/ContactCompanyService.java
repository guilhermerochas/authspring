package com.github.guilhermerochas.authspring.project.services;

import com.github.guilhermerochas.authspring.project.models.ContactCompany;
import com.github.guilhermerochas.authspring.project.repositories.ContactCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactCompanyService {
    @Autowired
    private ContactCompanyRepository repository;

    public List<ContactCompany> getAllContactCompanies() {
        return repository.findAll();
    }

    public Optional<ContactCompany> getSingleCompany(Integer id) {
        return repository.findById(id);
    }
}
