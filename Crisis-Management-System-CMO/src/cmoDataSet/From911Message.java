package cmoDataSet;

import java.sql.Date;
import java.sql.Time;

/**Extends from SimpleMessage class for messages coming from 911.
 * 
 * @author Ong Hock Leng
 *
 */

public class From911Message extends SimpleMessage{
	private String crisisType;
	private String affectedArea;
	private int longtitude;
	private int latitude;
	private Date crisisDate;
	private Time estimatedStartTime;
	private String details;
	
	public From911Message(	String identifier, String crisisId, String senderName, String senderPosition,
							String crisisType, String affectedArea, int longtitude, int latitude,
							Date crisisDate, Time estimatedStartTime, String details) {
		super(identifier, crisisId, senderName, senderPosition);
		this.crisisType = crisisType;
		this.affectedArea = affectedArea;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.crisisDate = crisisDate;
		this.estimatedStartTime = estimatedStartTime;
		this.details = details;
	}
	
	public From911Message(	String identifier, String crisisId, String senderName, String senderPosition,
							String crisisType, String affectedArea, /*String longtitude, String latitude,*/
							String crisisDate, String estimatedStartTime, String details) {
		// 
	}
	
	// Getters and Setters
	public String getCrisisType() {
		return crisisType;
	}
	public String getAffectedArea() {
		return affectedArea;
	}
	public int getLongtitude() {
		return longtitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public Date getCrisisDate() {
		return crisisDate;
	}
	public Time getEstimatedStartTime() {
		return estimatedStartTime;
	}
	public String getDetails() {
		return details;
	}
	public void setCrisisType(String crisisType) {
		this.crisisType = crisisType;
	}
	public void setAffectedArea(String affectedArea) {
		this.affectedArea = affectedArea;
	}
	public void setLongtitude(int longtitude) {
		this.longtitude = longtitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public void setCrisisDate(Date crisisDate) {
		this.crisisDate = crisisDate;
	}
	public void setEstimatedStartTime(Time estimatedStartTime) {
		this.estimatedStartTime = estimatedStartTime;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
