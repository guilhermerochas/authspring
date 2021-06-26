package com.github.guilhermerochas.authspring.project.services;

import com.github.guilhermerochas.authspring.project.dto.InfoContactDto;
import com.github.guilhermerochas.authspring.project.models.UserContact;
import com.github.guilhermerochas.authspring.project.repositories.UserContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserContactService {
    @Autowired
    private UserContactRepository repository;

    public List<UserContact> getUserContacts() {
        return repository.findAll();
    }

    public Optional<UserContact> getSingleContact(Integer id) {
        return repository.findById(id);
    }

    public List<InfoContactDto> getInfoContact() {
        return repository.getInfoContact();
    }
}
