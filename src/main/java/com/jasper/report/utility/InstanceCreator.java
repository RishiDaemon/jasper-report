package com.jasper.report.utility;

import java.util.*;

import com.jasper.report.dto.TalentProfileDataSource;
import com.jasper.report.dto.WorkExperience;

public class InstanceCreator {
	
	public static List<TalentProfileDataSource> getTalentprofiles() {
		TalentProfileDataSource talentprofile1 = new TalentProfileDataSource();
		TalentProfileDataSource talentprofile2 = new TalentProfileDataSource();
		List<TalentProfileDataSource> talentprofiles = new ArrayList<TalentProfileDataSource>(2);
		talentprofile1.setFullname("SYED MUHAMMAD ALI SYED JAFFRI");
		talentprofile1.setJobTitle("Director Talent Management");
		talentprofile1.setTotalYearsOfExperience("10");
		talentprofile1.setDepartment("Department of Government Services ADIA");
		talentprofile1.setAboutText("Experienced Human Resources Director in the investment management industry. Skilled in Talent Management, Employee Engagement, Organisational Culture and Diversity.");
		talentprofile1.setMobile("920001234567");
		talentprofile1.setAlternateMobile("920001234567");
		talentprofile1.setEmail("muhammad.ali01@hotmail.com");
		talentprofile1.setAlternateEmail("muhammad.ali01@hotmail.com");
		talentprofile1.setLocation("Dubai UAE");
		talentprofile1.setAddress("405, Al Noor Tower-1, Tecom, Dubai , United Arab Emirates");
		talentprofile1.setLandlineNumber("9710467677");
		talentprofile1.setLanguages("English, Hindi, Arabic, Marathi");
		talentprofile1.setGender("Male");
		talentprofile1.setMaritalStatus("Married");
		talentprofile1.setDob("05 APR 1991");
		talentprofile1.setNationality("Indian");
		talentprofile1.setEmiratesId("784199029524750");
		talentprofile1.setPrefrences("eBooks, Group Learning, Online, videos");
		talentprofile1.setHobbies("Singing, Dancing, Playing Music");
		
		talentprofile2.setFullname("Rishabh Tiwari");
		talentprofile2.setJobTitle("Director Talent Management");
		talentprofile2.setTotalYearsOfExperience("10");
		talentprofile2.setDepartment("Department of Government Services ADIA");
		talentprofile2.setAboutText("Experienced Human Resources Director in the investment management industry. Skilled in Talent Management, Employee Engagement, Organisational Culture and Diversity.");
		talentprofile2.setMobile("920001234567");
		talentprofile2.setAlternateMobile("920001234567");
		talentprofile2.setEmail("muhammad.ali01@hotmail.com");
		talentprofile2.setAlternateEmail("muhammad.ali01@hotmail.com");
		talentprofile2.setLocation("Dubai UAE");
		talentprofile2.setAddress("405, Al Noor Tower-1, Tecom, Dubai , United Arab Emirates");
		talentprofile2.setLandlineNumber("9710467677");
		talentprofile2.setLanguages("English, Hindi, Arabic, Marathi");
		talentprofile2.setGender("Male");
		talentprofile2.setMaritalStatus("Married");
		talentprofile2.setDob("05 APR 1991");
		talentprofile2.setNationality("Indian");
		talentprofile2.setEmiratesId("784199029524750");
		talentprofile2.setPrefrences("eBooks, Group Learning, Online, videos");
		talentprofile2.setHobbies("Singing, Dancing, Playing Music");
		
		talentprofiles.add(talentprofile1);
		talentprofiles.add(talentprofile2);
		return talentprofiles;
	}
	
	public static TalentProfileDataSource getTalentprofile() {
		TalentProfileDataSource talentprofile2 = new TalentProfileDataSource();		
		talentprofile2.setFullname("Muhammad Naeem Uddin");
		talentprofile2.setJobTitle("Director Talent Management");
		talentprofile2.setTotalYearsOfExperience("16 Years Experience");
		talentprofile2.setDepartment("Department of Government Services ADIA");
		talentprofile2.setAboutText("Experienced Human Resources Director in the investment management industry. Skilled in Talent Management, Employee Engagement, Organisational Culture and Diversity.");
		talentprofile2.setMobile("920001234567");
		talentprofile2.setAlternateMobile("920001234567");
		talentprofile2.setEmail("muhammad.ali01@hotmail.com");
		talentprofile2.setAlternateEmail("muhammad.ali01@hotmail.com");
		talentprofile2.setLocation("Dubai UAE");
		talentprofile2.setAddress("405, Al Noor Tower-1, Tecom, Dubai , United Arab Emirates");
		talentprofile2.setLandlineNumber("9710467677");
		talentprofile2.setLanguages("English, Hindi, Arabic, Marathi");
		talentprofile2.setGender("Male");
		talentprofile2.setMaritalStatus("Married");
		talentprofile2.setDob("05 APR 1991");
		talentprofile2.setNationality("Indian");
		talentprofile2.setEmiratesId("784199029524750");
		talentprofile2.setPrefrences("eBooks, Group Learning, Online, videos");
		talentprofile2.setHobbies("Singing, Dancing, Playing Music");
		return talentprofile2;
	}
	
	public static List<WorkExperience> getWorkExperiences() {
		
		WorkExperience experience1 =  new WorkExperience();
		experience1.setOrganizationName("Department of HR to Support Services");
		experience1.setDuration("Sep 2022 - Present I Full-time I Department of HR to Support Services I Abu Dhabi, UAE");
		experience1.setDepartment("Department of Government Enablement  | Management");
		experience1.setJobTitle("Director Talent Management");
		experience1.setLogo(null);
		experience1.setReportsTo("Reporting to: Ahmed Ali Sheikh, Chairman, Abu Dhabi\n"
				+ "Department of Health");
		experience1.setResponsibilities("Created and Managed the overall provision of Human Resource department, policies, and programs for the entire company");
		List<WorkExperience> workExperience  =  new ArrayList<WorkExperience>();
		workExperience.add(experience1);
		return workExperience;
		
	}
}
