package cmo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Feedback Report from EF
 *
 */

@Entity
public class FeedbackReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long feedbackReportID;
	private long crisisID;
	private String name;
	private String positionInEF;
	private int threatLevel;
	private int casualtiesRescued;
	private String deploymentStatus;
	private String situationStatus;
	@CreationTimestamp
	private Timestamp messageReceivedTime;
	private boolean read = false;

	public FeedbackReport() {
		crisisID = 0;
	}

	public FeedbackReport(long feedbackReportID, long crisisID, String name, String positionInEF, int threatLevel,
			int casualtiesRescued, String deploymentStatus, String situationStatus, Timestamp messageReceivedTime,
			boolean read) {
		this.feedbackReportID = feedbackReportID;
		this.crisisID = crisisID;
		this.name = name;
		this.positionInEF = positionInEF;
		this.threatLevel = threatLevel;
		this.casualtiesRescued = casualtiesRescued;
		this.deploymentStatus = deploymentStatus;
		this.situationStatus = situationStatus;
		this.messageReceivedTime = messageReceivedTime;
		this.read = read;
	}

	public long getFeedbackReportID() {
		return feedbackReportID;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public String getName() {
		return name;
	}

	public String getPositionInEF() {
		return positionInEF;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	public int getCasualtiesRescued() {
		return casualtiesRescued;
	}

	public String getDeploymentStatus() {
		return deploymentStatus;
	}

	public String getSituationStatus() {
		return situationStatus;
	}

	public Timestamp getMessageReceivedTime() {
		return messageReceivedTime;
	}

	public boolean isRead() {
		return read;
	}

	public void setFeedbackReportID(long feedbackReportID) {
		this.feedbackReportID = feedbackReportID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPositionInEF(String positionInEF) {
		this.positionInEF = positionInEF;
	}

	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}

	public void setCasualtiesRescued(int casualtiesRescued) {
		this.casualtiesRescued = casualtiesRescued;
	}

	public void setDeploymentStatus(String deploymentStatus) {
		this.deploymentStatus = deploymentStatus;
	}

	public void setSituationStatus(String situationStatus) {
		this.situationStatus = situationStatus;
	}

	public void setMessageReceivedTime(Timestamp messageReceivedTime) {
		this.messageReceivedTime = messageReceivedTime;
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
		FeedbackReport other = (FeedbackReport) obj;
		if (crisisID != other.crisisID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FeedbackReport [feedbackReportID=" + feedbackReportID + ", crisisID=" + crisisID + ", name=" + name
				+ ", positionInEF=" + positionInEF + ", threatLevel=" + threatLevel + ", casualtiesRescued="
				+ casualtiesRescued + ", deploymentStatus=" + deploymentStatus + ", situationStatus=" + situationStatus
				+ ", messageReceivedTime=" + messageReceivedTime + ", read=" + read + "]";
	}

}