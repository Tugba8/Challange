package com.example.challange.dao;

import com.example.challange.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Long> {

}

