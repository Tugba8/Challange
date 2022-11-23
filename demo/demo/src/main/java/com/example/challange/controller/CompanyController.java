package com.example.challange.controller;

import com.example.challange.entity.Company;
import com.example.challange.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
@RequiredArgsConstructor

public class CompanyController {

    private final ICompanyService service;

    @PostMapping
    public Company addCompany(@RequestBody Company company){
        return service.addCompany(company);
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable Long id){
        return service.getCompany(id);
    }

}
