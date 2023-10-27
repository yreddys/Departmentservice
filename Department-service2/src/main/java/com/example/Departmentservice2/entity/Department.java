package com.example.Departmentservice2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {
@Id
@GeneratedValue
private long departmentId;
private String departmentName;


}
