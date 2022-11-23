package com.example.challange.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Company {
    @Id
    @SequenceGenerator(name = "Company", sequenceName = "COMPANY_ID_SEQ")
    @GeneratedValue(generator = "Company")
    private Long id;

    @Column(length = 50)
    private String name;

}
