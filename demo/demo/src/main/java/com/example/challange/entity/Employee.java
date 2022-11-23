package com.example.challange.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @SequenceGenerator(name = "Employee", sequenceName = "EMPLOYEE_ID_SEQ")
    @GeneratedValue(generator = "Employee")

    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String lastname;

    @ManyToOne
    private Company company;


}
