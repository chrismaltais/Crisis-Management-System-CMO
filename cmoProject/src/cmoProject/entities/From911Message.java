package cmoProject.entities;

import java.sql.Timestamp;

/**
 * Message entry from 911 to CMO. Longitude and Latitude requires further
 * processing due to expected combination with variable affectedArea.
 *
 * @author Ong Hock Leng
 */
public class From911Message {

    private int messageCounter;
    private Timestamp timestamp;
    private String crisisId;
    private String senderName;
    private String senderPosition;
    private String crisisType;
    private String affectedArea;
    private double longitude;
    private double latitude;
    private String date;
    private String details;

    public From911Message(int messageCounter, Timestamp timestamp,
            String crisisId, String senderName, String senderPosition,
            String crisisType, String affectedArea, double longitude,
            double latitude, String date, String details) {
        this.messageCounter = messageCounter;
        this.timestamp = timestamp;
        this.crisisId = crisisId;
        this.senderName = senderName;
        this.senderPosition = senderPosition;
        this.crisisType = crisisType;
        this.affectedArea = affectedArea;
        this.longitude = longitude;
        this.latitude = latitude;
        this.date = date;
        this.details = details;
    }

    public int getMessageCounter() {
        return messageCounter;
    }

    public void setMessageCounter(int messageCounter) {
        this.messageCounter = messageCounter;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getCrisisId() {
        return crisisId;
    }

    public void setCrisisId(String crisisId) {
        this.crisisId = crisisId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPosition() {
        return senderPosition;
    }

    public void setSenderPosition(String senderPosition) {
        this.senderPosition = senderPosition;
    }

    public String getCrisisType() {
        return crisisType;
    }

    public void setCrisisType(String crisisType) {
        this.crisisType = crisisType;
    }

    public String getAffectedArea() {
        return affectedArea;
    }

    public void setAffectedArea(String affectedArea) {
        this.affectedArea = affectedArea;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
