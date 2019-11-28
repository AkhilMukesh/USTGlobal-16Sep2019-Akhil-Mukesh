package com.ustglobsl.jpawithhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_info")
public class CompanyInfo {
	@Id
	@Column
	private int id;
	@Column
	private String cname;
	@Column
	private String clocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}


}
