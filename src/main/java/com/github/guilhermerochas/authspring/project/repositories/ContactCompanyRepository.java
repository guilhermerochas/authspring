package com.github.guilhermerochas.authspring.project.repositories;

import com.github.guilhermerochas.authspring.project.models.ContactCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactCompanyRepository  extends JpaRepository<ContactCompany, Integer> {}
