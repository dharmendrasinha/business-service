package com.business.service.domain;

import java.time.Instant;

public class ProjectLog {
	private Instant projectDate;
	private String projectUser;
	private String entryDetails;
	public Instant getProjectDate() {
		return projectDate;
	}
	public void setProjectDate(Instant projectDate) {
		this.projectDate = projectDate;
	}
	public String getProjectUser() {
		return projectUser;
	}
	public void setProjectUser(String projectUser) {
		this.projectUser = projectUser;
	}
	public String getEntryDetails() {
		return entryDetails;
	}
	public void setEntryDetails(String entryDetails) {
		this.entryDetails = entryDetails;
	}
}
