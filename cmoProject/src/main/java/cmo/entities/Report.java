package cmo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Report {

	@Id @GeneratedValue
	private long reportID;
	private long crisisID;
	private String positionInCMO;
	private int threatLevel;
	private String affectedAreas;
	private int estimatedCasualties;
	private String crisisDuration;
	private String courseOfActions;
	private String consequencesOfAction;
	@CreationTimestamp
	private Timestamp createdTime;
	private boolean read = false;

	public Report() {
		crisisID = 0;
	}

	public Report(long crisisID, String positionInCMO, int threatLevel, String affectedAreas, int estimatedCasualties,
			String crisisDuration, String courseOfActions, String consequencesOfAction, Timestamp createdTime,
			boolean read) {
		this.crisisID = crisisID;
		this.positionInCMO = positionInCMO;
		this.threatLevel = threatLevel;
		this.affectedAreas = affectedAreas;
		this.estimatedCasualties = estimatedCasualties;
		this.crisisDuration = crisisDuration;
		this.courseOfActions = courseOfActions;
		this.consequencesOfAction = consequencesOfAction;
		this.createdTime = createdTime;
		this.read = read;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public String getPositionInCMO() {
		return positionInCMO;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	public String getAffectedAreas() {
		return affectedAreas;
	}

	public int getEstimatedCasualties() {
		return estimatedCasualties;
	}

	public String getCrisisDuration() {
		return crisisDuration;
	}

	public String getCourseOfActions() {
		return courseOfActions;
	}

	public String getConsequencesOfAction() {
		return consequencesOfAction;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public boolean isRead() {
		return read;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setPositionInCMO(String positionInCMO) {
		this.positionInCMO = positionInCMO;
	}

	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}

	public void setAffectedAreas(String affectedAreas) {
		this.affectedAreas = affectedAreas;
	}

	public void setEstimatedCasualties(int estimatedCasualties) {
		this.estimatedCasualties = estimatedCasualties;
	}

	public void setCrisisDuration(String crisisDuration) {
		this.crisisDuration = crisisDuration;
	}

	public void setCourseOfActions(String courseOfActions) {
		this.courseOfActions = courseOfActions;
	}

	public void setConsequencesOfAction(String consequencesOfAction) {
		this.consequencesOfAction = consequencesOfAction;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (crisisID ^ (crisisID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (crisisID != other.crisisID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [crisisID=" + crisisID + ", positionInCMO=" + positionInCMO + ", threatLevel=" + threatLevel
				+ ", affectedAreas=" + affectedAreas + ", estimatedCasualties=" + estimatedCasualties
				+ ", crisisDuration=" + crisisDuration + ", courseOfActions=" + courseOfActions
				+ ", consequencesOfAction=" + consequencesOfAction + ", createdTime=" + createdTime + ", read=" + read
				+ "]";
	}

}