package com.jasper.report.dto;

public class ReportDto {
	
	public ReportDto(byte[] reportData, String fileName, String fileType) {
		super();
		this.reportData = reportData;
		this.fileName = fileName;
		this.fileType = fileType;
	}
	public ReportDto() {
		super();
	}
	
	private byte[] reportData;
	private String fileName;
	private String fileType;
	public byte[] getReportData() {
		return reportData;
	}
	public void setReportData(byte[] reportData) {
		this.reportData = reportData;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
}
