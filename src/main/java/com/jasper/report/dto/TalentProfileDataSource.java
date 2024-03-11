package com.jasper.report.dto;

import java.util.List;

public class TalentProfileDataSource {
	
	public TalentProfileDataSource(String organizationName, String jobTitle, String totalYearsOfExperience,
			String department, String firstName, String lastName, String fullname, String aboutText, String mobile,
			String alternateMobile, String email, String alternateEmail, String location, String address,
			String landlineNumber, String languages, String gender, String maritalStatus, String dob,
			String nationality, String emiratesId, String prefrences, String hobbies, String picture,
			List<WorkExperience> workExperience) {
		super();
		this.organizationName = organizationName;
		this.jobTitle = jobTitle;
		this.totalYearsOfExperience = totalYearsOfExperience;
		this.department = department;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullname = fullname;
		this.aboutText = aboutText;
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.email = email;
		this.alternateEmail = alternateEmail;
		this.location = location;
		this.address = address;
		this.landlineNumber = landlineNumber;
		this.languages = languages;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.dob = dob;
		this.nationality = nationality;
		this.emiratesId = emiratesId;
		this.prefrences = prefrences;
		this.hobbies = hobbies;
		this.picture = picture;
		this.workExperience = workExperience;
	}

	public TalentProfileDataSource() {}
	
	private String labelAbout;
	private String contactInfo;
	
	private String organizationName;
	private String jobTitle;
	private String totalYearsOfExperience;
	private String department;
	private String firstName;
	private String lastName;
	private String fullname;
	private String aboutText;
	private String mobile;
	private String alternateMobile;
	private String email;
	private String alternateEmail;
	private String location;
	private String address;
	private String landlineNumber;
	private String languages;
	private String gender;
	private String maritalStatus;
	private String dob;
	private String nationality;
	private String emiratesId;
	private String prefrences;
	private String hobbies;
	private String picture;
	private List<WorkExperience> workExperience;
	
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getTotalYearsOfExperience() {
		return totalYearsOfExperience;
	}
	public void setTotalYearsOfExperience(String totalYearsOfExperience) {
		this.totalYearsOfExperience = totalYearsOfExperience;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	public String getAboutText() {
		return aboutText;
	}
	public void setAboutText(String aboutText) {
		this.aboutText = aboutText;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandlineNumber() {
		return landlineNumber;
	}
	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEmiratesId() {
		return emiratesId;
	}
	public void setEmiratesId(String emiratesId) {
		this.emiratesId = emiratesId;
	}
	public String getPrefrences() {
		return prefrences;
	}
	public void setPrefrences(String prefrences) {
		this.prefrences = prefrences;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}
	
}
