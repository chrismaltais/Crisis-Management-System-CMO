package cmo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

/**To PMO
 * 
 * @author HawksSeptua
 *
 */

@Entity
public class Proposal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long proposalID;
	private long crisisID;
	private String name;
	private String positionInCMO;
	private int threatLevel;
	private String crisisType;
	private String affectedArea;
	private int estimatedCasualties;
	private String crisisDuration;
	private String crisisDetails;
	private String courseOfAction;
	private String consequencesOfAction;
	private String cleanUpAction;
	@CreationTimestamp
	private Timestamp createdTime;
	private boolean read = false;

	public Proposal() {
		crisisID = 0;
	}

	public Proposal(long proposalID, long crisisID, String name, String positionInCMO, int threatLevel,
			String crisisType, String affectedArea, int estimatedCasualties, String crisisDuration,
			String crisisDetails, String courseOfAction, String consequencesOfAction, String cleanUpAction,
			Timestamp createdTime, boolean read) {
		this.proposalID = proposalID;
		this.crisisID = crisisID;
		this.name = name;
		this.positionInCMO = positionInCMO;
		this.threatLevel = threatLevel;
		this.crisisType = crisisType;
		this.affectedArea = affectedArea;
		this.estimatedCasualties = estimatedCasualties;
		this.crisisDuration = crisisDuration;
		this.crisisDetails = crisisDetails;
		this.courseOfAction = courseOfAction;
		this.consequencesOfAction = consequencesOfAction;
		this.cleanUpAction = cleanUpAction;
		this.createdTime = createdTime;
		this.read = read;
	}

	// for use by cmo.tony.CMOPMOClient
	public Proposal(long crisisID, String name, String positionInCMO, int threatLevel, String crisisType,
			String affectedArea, int estimatedCasualties, String crisisDuration, String crisisDetails,
			String courseOfAction, String consequencesOfAction, String cleanUpAction) {
		this.crisisID = crisisID;
		this.name = name;
		this.positionInCMO = positionInCMO;
		this.threatLevel = threatLevel;
		this.crisisType = crisisType;
		this.affectedArea = affectedArea;
		this.estimatedCasualties = estimatedCasualties;
		this.crisisDuration = crisisDuration;
		this.crisisDetails = crisisDetails;
		this.courseOfAction = courseOfAction;
		this.consequencesOfAction = consequencesOfAction;
		this.cleanUpAction = cleanUpAction;
	}

	public long getProposalID() {
		return proposalID;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public String getName() {
		return name;
	}

	public String getPositionInCMO() {
		return positionInCMO;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	public String getCrisisType() {
		return crisisType;
	}

	public String getAffectedArea() {
		return affectedArea;
	}

	public int getEstimatedCasualties() {
		return estimatedCasualties;
	}

	public String getCrisisDuration() {
		return crisisDuration;
	}

	public String getCrisisDetails() {
		return crisisDetails;
	}

	public String getCourseOfAction() {
		return courseOfAction;
	}

	public String getConsequencesOfAction() {
		return consequencesOfAction;
	}

	public String getCleanUpAction() {
		return cleanUpAction;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public boolean isRead() {
		return read;
	}

	public void setProposalID(long proposalID) {
		this.proposalID = proposalID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPositionInCMO(String positionInCMO) {
		this.positionInCMO = positionInCMO;
	}

	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}

	public void setCrisisType(String crisisType) {
		this.crisisType = crisisType;
	}

	public void setAffectedArea(String affectedArea) {
		this.affectedArea = affectedArea;
	}

	public void setEstimatedCasualties(int estimatedCasualties) {
		this.estimatedCasualties = estimatedCasualties;
	}

	public void setCrisisDuration(String crisisDuration) {
		this.crisisDuration = crisisDuration;
	}

	public void setCrisisDetails(String crisisDetails) {
		this.crisisDetails = crisisDetails;
	}

	public void setCourseOfAction(String courseOfAction) {
		this.courseOfAction = courseOfAction;
	}

	public void setConsequencesOfAction(String consequencesOfAction) {
		this.consequencesOfAction = consequencesOfAction;
	}

	public void setCleanUpAction(String cleanUpAction) {
		this.cleanUpAction = cleanUpAction;
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
		Proposal other = (Proposal) obj;
		if (crisisID != other.crisisID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proposal [proposalID=" + proposalID + ", crisisID=" + crisisID + ", name=" + name + ", positionInCMO="
				+ positionInCMO + ", threatLevel=" + threatLevel + ", crisisType=" + crisisType + ", affectedArea="
				+ affectedArea + ", estimatedCasualties=" + estimatedCasualties + ", crisisDuration=" + crisisDuration
				+ ", crisisDetails=" + crisisDetails + ", courseOfAction=" + courseOfAction + ", consequencesOfAction="
				+ consequencesOfAction + ", cleanUpAction=" + cleanUpAction + ", createdTime=" + createdTime + ", read="
				+ read + "]";
	}

}