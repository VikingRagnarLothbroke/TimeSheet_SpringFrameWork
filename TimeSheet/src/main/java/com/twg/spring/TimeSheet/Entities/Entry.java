package com.twg.spring.TimeSheet.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entries")
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String entrydate;
	
	private String workupdates;
	
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}

	public String getWorkupdates() {
		return workupdates;
	}

	public void setWorkupdates(String workupdates) {
		this.workupdates = workupdates;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Entry [id=" + id + ", entrydate=" + entrydate + ", workupdates=" + workupdates + ", userid=" + userid
				+ "]";
	}
}
