package com.example.accessingdatamysql;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String name;
	private String email;
	private String password;
	private Date reg_date;

}
