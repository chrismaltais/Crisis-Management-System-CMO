package cmo.entities;

import java.sql.Timestamp;

/**
 * Message entry from EF to CMO.
 *
 * @author Ong Hock Leng
 */
public class FromEfMessage {

    private int messageCounter;
    private Timestamp timestamp;
    private String crisisId;
    private String senderName;
    private String senderPosition;
    private int threatLevel;
    private int estimatedCasualtiesRescued;
    private String deploymentStatus;
    private String situation;

    public FromEfMessage(int messageCounter, Timestamp timestamp,
            String crisisId, String senderName, String senderPosition,
            int threatLevel, int estimatedCasualtiesRescued,
            String deploymentStatus, String situation) {
        this.messageCounter = messageCounter;
        this.timestamp = timestamp;
        this.crisisId = crisisId;
        this.senderName = senderName;
        this.senderPosition = senderPosition;
        this.threatLevel = threatLevel;
        this.estimatedCasualtiesRescued = estimatedCasualtiesRescued;
        this.deploymentStatus = deploymentStatus;
        this.situation = situation;
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

    public int getEstimatedCasualtiesRescued() {
        return estimatedCasualtiesRescued;
    }

    public void setEstimatedCasualtiesRescued(int estimatedCasualtiesRescued) {
        this.estimatedCasualtiesRescued = estimatedCasualtiesRescued;
    }

    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
