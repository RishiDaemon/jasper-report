package com.jasper.report.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jasper.report.dto.ReportDto;
import com.jasper.report.service.JasperReportGenerator;

import net.sf.jasperreports.engine.JRException;
@RestController
public class JasperController {
	
	@Autowired
	private JasperReportGenerator jsperreportCreator;
	
	@GetMapping("/")
	  public ResponseEntity<Resource> getItemReport() throws JRException, IOException {

		ReportDto reportContent;
		try {
			reportContent = jsperreportCreator.generateReport();
		    ByteArrayResource resource = new ByteArrayResource(reportContent.getReportData());
		    return ResponseEntity.ok()
			        .contentType(MediaType.APPLICATION_OCTET_STREAM)
			        .contentLength(resource.contentLength())
			        .header(HttpHeaders.CONTENT_DISPOSITION,
			            ContentDisposition.attachment()
			                .filename(reportContent.getFileName())
			                .build().toString())
			        .body(resource);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	  }
}
