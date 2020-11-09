package com.sanjayacchana.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sanjayacchana.springmvc.customvalidation.CourseCode;


public class Customer {
	
	private String firstName;
	
	@NotNull(message="is Requried")
	@Size(min=2, message="is Requried")
	private String lastName;
	
	@NotNull(message="is Requried")
	@Min(value=0,message="must be greather than or equal to 0")
	@Max(value=10,message="must be lessthan or equal to 10")
	private Integer freePases;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value = "sanju",message = "must start with sanju")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePases() {
		return freePases;
	}

	public void setFreePases(Integer freePases) {
		this.freePases = freePases;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
