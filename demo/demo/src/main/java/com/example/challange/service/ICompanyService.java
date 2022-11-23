package com.example.challange.service;

import com.example.challange.entity.Company;

public interface ICompanyService {
    Company addCompany(Company company);
    String deleteCompany(long id);

    Company getCompany(long id);


}
