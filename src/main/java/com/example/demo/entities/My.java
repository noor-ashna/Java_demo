package com.example.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "my_table")
public class My {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer myId;
	@Column(name = "name", nullable = false)
	private String myName;
	private int age;

	private LocalDate createdDate;
	private LocalDate updatedDate;

	public My(String myName, int age, LocalDate createdDate, LocalDate updatedDate) {
		this.myName = myName;
		this.age = age;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

}
