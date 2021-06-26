package com.github.guilhermerochas.authspring.project.controllers;

import com.github.guilhermerochas.authspring.project.dto.InfoContactDto;
import com.github.guilhermerochas.authspring.project.models.UserContact;
import com.github.guilhermerochas.authspring.project.services.UserContactService;
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
@RequestMapping("/api/user")
public class UserContactController {
    @Autowired
    private UserContactService service;

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return new ResponseEntity<List<UserContact>>(service.getUserContacts(), HttpStatus.OK);
        } catch (Exception e) {
            return HttpUtils.errorResultUtil(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getSingleUser(@PathVariable Integer id) {
        try {
            Optional<UserContact> contactOptional = service.getSingleContact(id);

            return contactOptional.map(contact -> new ResponseEntity<>(contact, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity(HttpStatus.NO_CONTENT));

        } catch (Exception e) {
            return HttpUtils.errorResultUtil(e);
        }
    }

    @GetMapping(path = "/infocontact")
    public ResponseEntity getInfoContact() {
        try {
            return new ResponseEntity<List<InfoContactDto>>(service.getInfoContact(), HttpStatus.OK);
        } catch (Exception e) {
            return HttpUtils.errorResultUtil(e);
        }
    }
}
