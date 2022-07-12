package com.ojas.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="cricketteams")
public class TeamsEntity {
	@Id
	@GenericGenerator(name="MyGenerator",strategy = "increment")
	@GeneratedValue(generator = "MyGenerator",strategy = GenerationType.AUTO)
	@Column(name="TID")
private Integer tid;
@Column(name="TNAME")
private String tname;
@Column(name="TCOUNTRY")
private String tcountry;
@Column(name="TLANGUAGE")
private String tlanguage;

}
