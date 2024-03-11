package com.jasper.report.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.jasper.report.dto.ReportDto;
import com.jasper.report.dto.TalentProfileDataSource;
import com.jasper.report.dto.WorkExperience;
import com.jasper.report.utility.Constants;
import com.jasper.report.utility.InstanceCreator;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class JasperReportGenerator {
 
    public ReportDto generateReport() throws Exception {
    	
    	// Get Talent Profile First
    	TalentProfileDataSource talentProfileData= InstanceCreator.getTalentprofile();
    	List<TalentProfileDataSource> talentProfileList =  new ArrayList<>(1);
    	talentProfileList.add(talentProfileData);
    	
    	// Get Work Experience as well
    	
    	List<WorkExperience> workExperience= InstanceCreator.getWorkExperiences();
    	 // Convert the list of employees to a JRBeanCollectionDataSource
        JRBeanCollectionDataSource talentProfileDataSource = new JRBeanCollectionDataSource(talentProfileList);
        JRBeanCollectionDataSource workExperienceDataSource = new JRBeanCollectionDataSource(workExperience);

      
        
        
    	// Read the Jasper file  and compile it
        InputStream masterReportTemplate = getClass().getResourceAsStream(Constants.MASTER_TALENT_PROFILE_REPORT_JRXML); 
        InputStream workExperienceReportTemplate = getClass().getResourceAsStream(Constants.WORK_EXPERIENCE_TALENT_PROFILE_REPORT_JRXML);   

        
        JasperReport masterReport = JasperCompileManager.compileReport(masterReportTemplate);
        JasperReport workExperienceSubReport = JasperCompileManager.compileReport(workExperienceReportTemplate);
        
      
        
        // Create parameters for jasper fill report
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put(Constants.TALENT_PROFILE_DATASOURCE, talentProfileDataSource);
        parameters.put(Constants.TALENT_PROFILE_WORK_EXPERIENCE_DATASOURCE, workExperienceDataSource);
        parameters.put(Constants.WORK_EXPERIENCE_TALENT_PROFILE_REPORT_JRXML_DATA_SOURCE_NAME,workExperienceSubReport);
        
        // Generate the report using the compiled template and data source
        JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, talentProfileDataSource);
        
        // Export the report to a byte array (PDF format)
        byte[] reportBytes = JasperExportManager.exportReportToPdf(jasperPrint);
        
        // Created custom DTO to have filename and data associated to it.
        ReportDto customReportDto = new ReportDto();
        customReportDto.setReportData(reportBytes);
        
        // Setting filename to Talent profile's name
        customReportDto.setFileName(talentProfileList.get(0).getFullname()+Constants.JASPER_TALENT_REPORT_FILE_TYPE);
        
        
        return customReportDto;
    }
}
