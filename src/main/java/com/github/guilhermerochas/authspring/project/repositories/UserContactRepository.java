package com.github.guilhermerochas.authspring.project.repositories;

import com.github.guilhermerochas.authspring.project.dto.InfoContactDto;
import com.github.guilhermerochas.authspring.project.models.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserContactRepository extends JpaRepository<UserContact, Integer> {

    @Query(value = "SELECT id, first_name as firstName, last_name as lastName, " +
            "email, company_name as companyName, company_owner as companyOwner, " +
            "company_location as companyLocation " +
            "FROM INFO_CONTACT()", nativeQuery = true)
    List<InfoContactDto> getInfoContact();
}
