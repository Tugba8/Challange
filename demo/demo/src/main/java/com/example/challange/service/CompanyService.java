package com.example.challange.service;

import com.example.challange.dao.CompanyDao;
import com.example.challange.entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CompanyService implements ICompanyService {
    private final CompanyDao companyDao;

    @Override
    public Company addCompany( Company company){
        return companyDao.save(company);
    }

    @Override
    public String deleteCompany( long id){
        companyDao.deleteById(id);
        return "Company deleted successfully";

    }
    @Override
    public Company getCompany( long id){
        return companyDao.findById(id).orElseThrow();
    }
}
