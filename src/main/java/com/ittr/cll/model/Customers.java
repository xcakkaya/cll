package com.ittr.cll.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(schema = "DUKKAN") // KRITIK!!!!!!!!!!!!!
public class Customers {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 6, name = "TYPE")
	private String type;

	@Column(length = 40, name = "NAME")
	private String firstName;

	@Column(length = 40, name = "ADDITIONAL_NAME")
	private String additionalName;

	@Column(length = 40, name = "LASTNAME")
	private String lastName;

	@Column(name = "BIRTHDATE")
	private String birthDate;

	@Column(length = 4, name = "GENDER")
	private String gender;

	@Column(length = 4, name = "TITLE")
	private String title;

	@Column(length = 4, name = "MARITAL_STATUS")
	private String maritalStatus;

	@Column(length = 4, name = "EDUCATION")
	private String education;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAdditionalName() {
		return additionalName;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = "2020-02-02";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

}
