package com.jasper.report.dto;

public class WorkExperience {
	


	public WorkExperience(String logo, String jobTitle, String department, String duration, String reportsTo,
			String organizationName, String responsibilities) {
		super();
		this.logo = logo;
		this.jobTitle = jobTitle;
		this.department = department;
		this.duration = duration;
		this.reportsTo = reportsTo;
		this.organizationName = organizationName;
		this.responsibilities = responsibilities;
	}

	public WorkExperience() {
		super();
	}

	private String logo;
	private String jobTitle;
	private String department;
	private String duration;
	private String reportsTo;
	private String organizationName;
	private String responsibilities;
	
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
}
