package com.capg.mvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {
	@Id
	private long traineeId;
	@Column(length=10)
	private String traineeName;
	@Column(length=10)
	private String location;
	@Column(length=10)
	private String domain;
	
	public Trainee() {
		
	}
	public Trainee(Integer traineeId, String traineeName, String location, String domain) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.location = location;
		this.domain = domain;
	}
	public long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(long traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
