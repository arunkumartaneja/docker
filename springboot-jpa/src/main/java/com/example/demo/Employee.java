package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@SequenceGenerator(name = "emp_id_sequence", sequenceName = "emp_id_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_sequence")
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
}
