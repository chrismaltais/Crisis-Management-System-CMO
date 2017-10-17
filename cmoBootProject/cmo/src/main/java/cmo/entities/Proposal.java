package cmo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proposal {
	
	@Id
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
 
	public Proposal(){
        crisisID=0;
    }

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

	public long getCrisisID() {
		return crisisID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPositionInCMO() {
		return positionInCMO;
	}

	public void setPositionInCMO(String positionInCMO) {
		this.positionInCMO = positionInCMO;
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

	public String getConsequencesOfAction() {
		return consequencesOfAction;
	}

	public void setConsequencesOfAction(String consequencesOfAction) {
		this.consequencesOfAction = consequencesOfAction;
	}

	public String getCleanUpAction() {
		return cleanUpAction;
	}

	public void setCleanUpAction(String cleanUpAction) {
		this.cleanUpAction = cleanUpAction;
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
		return "Report [crisisID=" + crisisID + ", name=" + name + ", positionInCMO=" + positionInCMO
				+ ", threatLevel=" + threatLevel + ", crisisType=" + crisisType + ", affectedArea=" + affectedArea
				+ ", estimatedCasualties=" + estimatedCasualties + ", crisisDuration=" + crisisDuration
				+ ", crisisDetails=" + crisisDetails + ", courseOfAction=" + courseOfAction
				+ ", consequencesOfAction=" + consequencesOfAction + ", cleanUpAction=" + cleanUpAction + "]";
	}
 
}