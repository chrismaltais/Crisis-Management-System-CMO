package cmoProject.entities;

public class FeedbackReport {
	
	private long crisisID;
	private String name;
	private String positionInEF;
	private int threatLevel;
	private int casualtiesRescued;
	private String deploymentStatus;
	private String situationStatus;
 
	public FeedbackReport(){
        crisisID=0;
    }

	public FeedbackReport(long crisisID, String name, String positionInEF, int threatLevel, int casualtiesRescued,
			String deploymentStatus, String situationStatus) {
		this.crisisID = crisisID;
		this.name = name;
		this.positionInEF = positionInEF;
		this.threatLevel = threatLevel;
		this.casualtiesRescued = casualtiesRescued;
		this.deploymentStatus = deploymentStatus;
		this.situationStatus = situationStatus;
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

	public String getPositionInEF() {
		return positionInEF;
	}

	public void setPositionInEF(String positionInEF) {
		this.positionInEF = positionInEF;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}

	public int getCasualtiesRescued() {
		return casualtiesRescued;
	}

	public void setCasualtiesRescued(int casualtiesRescued) {
		this.casualtiesRescued = casualtiesRescued;
	}

	public String getDeploymentStatus() {
		return deploymentStatus;
	}

	public void setDeploymentStatus(String deploymentStatus) {
		this.deploymentStatus = deploymentStatus;
	}

	public String getSituationStatus() {
		return situationStatus;
	}

	public void setSituationStatus(String situationStatus) {
		this.situationStatus = situationStatus;
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
		return "Report [crisisID=" + crisisID + ", name=" + name + ", positionInEF=" + positionInEF
				+ ", threatLevel=" + threatLevel + ", casualtiesRescued=" + casualtiesRescued
				+ ", deploymentStatus=" + deploymentStatus + ", situationStatus=" + situationStatus + "]";
	}
 
 
}