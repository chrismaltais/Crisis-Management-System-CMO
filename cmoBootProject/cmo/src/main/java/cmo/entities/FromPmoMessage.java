package cmo.entities;

import java.sql.Timestamp;

/**
 * Message entry from PMO to CMO.
 *
 * @author Ong Hock Leng
 */
public class FromPmoMessage {

    private int messageCounter;
    private Timestamp timestamp;
    private String crisisId;
    private String senderName;
    private String senderPosition;
    private String proposalFeedback;
    private String proposalApproval;
    private String Signature;

    public FromPmoMessage(int messageCounter, Timestamp timestamp, 
            String crisisId, String senderName, String senderPosition, 
            String proposalFeedback, String proposalApproval, String Signature) {
        this.messageCounter = messageCounter;
        this.timestamp = timestamp;
        this.crisisId = crisisId;
        this.senderName = senderName;
        this.senderPosition = senderPosition;
        this.proposalFeedback = proposalFeedback;
        this.proposalApproval = proposalApproval;
        this.Signature = Signature;
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

    public String getProposalFeedback() {
        return proposalFeedback;
    }

    public void setProposalFeedback(String proposalFeedback) {
        this.proposalFeedback = proposalFeedback;
    }

    public String getProposalApproval() {
        return proposalApproval;
    }

    public void setProposalApproval(String proposalApproval) {
        this.proposalApproval = proposalApproval;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }
}
