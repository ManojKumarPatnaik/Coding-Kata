package com.epam.coding.kata.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="RELATIVES")
@Data
public class Relatives implements Serializable {
	
	
	private static final long serialVersionUID = 8251485748641223048L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="relativeid")
	private int relativeId;
	@Column(name="name")
	private String name;
	@Column(name="relation")
	private String relation;
	@Column(name="address")
	private String address;
	@Column(name="contactnumber")
	private long contactNumber;
}
