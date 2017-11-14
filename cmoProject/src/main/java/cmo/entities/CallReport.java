package cmo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Call Report from 911
 *
 */
@Entity
public class CallReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long callReportID;
	private long crisisID;
	private String name;
	private String positionIn911;
	private String crisisType;
	private String affectedArea;
	private String crisisDate;
	private String estimatedStartTime;
	private String crisisDetails;
	@CreationTimestamp
	private Timestamp messageReceivedTime;
	private boolean read = false;

	public CallReport() {
		crisisID = 0;
	}

	public CallReport(long callReportID, long crisisID, String name, String positionIn911, String crisisType,
			String affectedArea, String crisisDate, String estimatedStartTime, String crisisDetails,
			Timestamp messageReceivedTime, boolean read) {
		this.callReportID = callReportID;
		this.crisisID = crisisID;
		this.name = name;
		this.positionIn911 = positionIn911;
		this.crisisType = crisisType;
		this.affectedArea = affectedArea;
		this.crisisDate = crisisDate;
		this.estimatedStartTime = estimatedStartTime;
		this.crisisDetails = crisisDetails;
		this.messageReceivedTime = messageReceivedTime;
		this.read = read;
	}

	public long getCallReportID() {
		return callReportID;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public String getName() {
		return name;
	}

	public String getPositionIn911() {
		return positionIn911;
	}

	public String getCrisisType() {
		return crisisType;
	}

	public String getAffectedArea() {
		return affectedArea;
	}

	public String getCrisisDate() {
		return crisisDate;
	}

	public String getEstimatedStartTime() {
		return estimatedStartTime;
	}

	public String getCrisisDetails() {
		return crisisDetails;
	}

	public Timestamp getMessageReceivedTime() {
		return messageReceivedTime;
	}

	public boolean isRead() {
		return read;
	}

	public void setCallReportID(long callReportID) {
		this.callReportID = callReportID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPositionIn911(String positionIn911) {
		this.positionIn911 = positionIn911;
	}

	public void setCrisisType(String crisisType) {
		this.crisisType = crisisType;
	}

	public void setAffectedArea(String affectedArea) {
		this.affectedArea = affectedArea;
	}

	public void setCrisisDate(String crisisDate) {
		this.crisisDate = crisisDate;
	}

	public void setEstimatedStartTime(String estimatedStartTime) {
		this.estimatedStartTime = estimatedStartTime;
	}

	public void setCrisisDetails(String crisisDetails) {
		this.crisisDetails = crisisDetails;
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
		CallReport other = (CallReport) obj;
		if (crisisID != other.crisisID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CallReport [callReportID=" + callReportID + ", crisisID=" + crisisID + ", name=" + name
				+ ", positionIn911=" + positionIn911 + ", crisisType=" + crisisType + ", affectedArea=" + affectedArea
				+ ", crisisDate=" + crisisDate + ", estimatedStartTime=" + estimatedStartTime + ", crisisDetails="
				+ crisisDetails + ", messageReceivedTime=" + messageReceivedTime + ", read=" + read + "]";
	}

}