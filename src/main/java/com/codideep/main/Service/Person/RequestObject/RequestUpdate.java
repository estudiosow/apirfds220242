package com.codideep.main.Service.Person.RequestObject;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestUpdate {
	private String idPerson;
	private String firstName;
	private String surName;
	private String dni;
	private boolean gender;
	private String birthDate;
}
