package cmoDataSet;

/**The very basic format of messages used by CMO.
 * Should not be used directly.
 * 
 * @author Ong Hock Leng
 *
 */
public class SimpleMessage {
	String identifier;
	String crisisId;
	String senderName;
	String senderPosition;
	
	public SimpleMessage() {
		this("","","","");
	}
	
	public SimpleMessage(String identifier, String crisisId, String senderName, String senderPosition) {
		this.identifier = identifier;
		this.crisisId = crisisId;
		this.senderName = senderName;
		this.senderPosition = senderPosition;
	}
	
	
	// Getters and Setters
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public void setCrisisId(String crisisId) {
		this.crisisId = crisisId;
	}
	
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	public void setSenderPosition(String senderPosition) {
		this.senderPosition = senderPosition;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getCrisisId() {
		return crisisId;
	}
	
	public String getSenderName() {
		return senderName;
	}
	
	public String getSenderPosition() {
		return senderPosition;
	}
}
