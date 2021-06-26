package com.github.guilhermerochas.authspring.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

public interface InfoContactDto {
    int getId();
    String getFirstName();
    String getEmail();
    String getCompanyName();
    String getCompanyOwner();
    String getCompanyLocation();
}
