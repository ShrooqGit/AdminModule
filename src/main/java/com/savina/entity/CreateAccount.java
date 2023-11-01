package com.savina.entity;

import java.text.DateFormat;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "CASE_WORKERS")
public class CreateAccount {

	@Id
	@GeneratedValue
	private Integer createAcountId;
	
	private String fName;
	
	private String emailId;
	
	private Long pNo;
	
	private String gender;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate dob;
	
	private Long ssn;
	
	private String planName;
	
	private String palnCategory;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate startDate;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate endDate;
	
	
	public CreateAccount() {
		
	}
	
	public CreateAccount(String planName, String palnCategory) {
		super();
		this.planName = planName;
		this.palnCategory = palnCategory;
	}
	public String getPalnCategory() {
		return palnCategory;
	}
	public void setPalnCategory(String palnCategory) {
		this.palnCategory = palnCategory;
	}
	public Integer getCreateAcountId() {
		return createAcountId;
	}
	public void setCreateAcountId(Integer createAcountId) {
		this.createAcountId = createAcountId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getpNo() {
		return pNo;
	}
	public void setpNo(Long pNo) {
		this.pNo = pNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
}
