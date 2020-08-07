package com.ds.EmpoyeeApp2;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustmoerBean {
@Id
private Long Accno;
private String name;
private String lname;
private String  addr;

}
