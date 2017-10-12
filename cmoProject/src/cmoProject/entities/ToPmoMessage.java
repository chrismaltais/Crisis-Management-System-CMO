package cmoProject.entities;

import java.sql.Timestamp;

/**
 * Message entry from CMO to PMO. Longitude and Latitude requires further
 * processing due to expected combination with variable affectedArea.
 *
 * @author Ong Hock Leng
 */
public class ToPmoMessage {

    private int messageCounter;
    private Timestamp timestamp;
    private String crisisId;
    private String senderName;
    private String senderPosition;
    private int threatLevel;
    private String crisisType;
    private String affectedArea;
    private double longitude;
    private double latitude;
    private int estimatedCasualties;
    private String crisisDuration;
    private String crisisDetails;
    private String courseOfAction;
    private String consequencesForProposedAction;
    private String cleanUpActions;

    public ToPmoMessage(int messageCounter, Timestamp timestamp, String crisisId,
            String senderName, String senderPosition, int threatLevel,
            String crisisType, String affectedArea, double longitude,
            double latitude, int estimatedCasualties, String crisisDuration,
            String crisisDetails, String courseOfAction,
            String consequencesForProposedAction, String cleanUpActions) {
        this.messageCounter = messageCounter;
        this.timestamp = timestamp;
        this.crisisId = crisisId;
        this.senderName = senderName;
        this.senderPosition = senderPosition;
        this.threatLevel = threatLevel;
        this.crisisType = crisisType;
        this.affectedArea = affectedArea;
        this.longitude = longitude;
        this.latitude = latitude;
        this.estimatedCasualties = estimatedCasualties;
        this.crisisDuration = crisisDuration;
        this.crisisDetails = crisisDetails;
        this.courseOfAction = courseOfAction;
        this.consequencesForProposedAction = consequencesForProposedAction;
        this.cleanUpActions = cleanUpActions;
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

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
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

    public int getEstimatedCasualties() {
        return estimatedCasualties;
    }

    public void setEstimatedCasualties(int estimatedCasualties) {
        this.estimatedCasualties = estimatedCasualties;
    }

    public String getCrisisDuration() {
        return crisisDuration;
    }

    public void setCrisisDuration(String crisisDuration) {
        this.crisisDuration = crisisDuration;
    }

    public String getCrisisDetails() {
        return crisisDetails;
    }

    public void setCrisisDetails(String crisisDetails) {
        this.crisisDetails = crisisDetails;
    }

    public String getCourseOfAction() {
        return courseOfAction;
    }

    public void setCourseOfAction(String courseOfAction) {
        this.courseOfAction = courseOfAction;
    }

    public String getConsequencesForProposedAction() {
        return consequencesForProposedAction;
    }

    public void setConsequencesForProposedAction(String consequencesForProposedAction) {
        this.consequencesForProposedAction = consequencesForProposedAction;
    }

    public String getCleanUpActions() {
        return cleanUpActions;
    }

    public void setCleanUpActions(String cleanUpActions) {
        this.cleanUpActions = cleanUpActions;
    }
}
