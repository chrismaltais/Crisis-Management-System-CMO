package nesims.main.model;

public class Report {
	
	private long crisisID;
	private String positionInCMO;
	private int threatLevel;
	private String affectedAreas;
	private int estimatedCasualties;
	private String crisisDuration;
	private String courseOfActions;
	private String consequencesOfAction;
 
    public Report(){
        crisisID=0;
    }
    
    public Report(long crisisID, String positionInCMO, int threatLevel, String affectedAreas, int estimatedCasualties,
			String crisisDuration, String courseOfActions, String consequencesOfAction) {
		this.crisisID = crisisID;
		this.positionInCMO = positionInCMO;
		this.threatLevel = threatLevel;
		this.affectedAreas = affectedAreas;
		this.estimatedCasualties = estimatedCasualties;
		this.crisisDuration = crisisDuration;
		this.courseOfActions = courseOfActions;
		this.consequencesOfAction = consequencesOfAction;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
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

	public String getAffectedAreas() {
		return affectedAreas;
	}

	public void setAffectedAreas(String affectedAreas) {
		this.affectedAreas = affectedAreas;
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

	public String getCourseOfActions() {
		return courseOfActions;
	}

	public void setCourseOfActions(String courseOfActions) {
		this.courseOfActions = courseOfActions;
	}

	public String getConsequencesOfAction() {
		return consequencesOfAction;
	}

	public void setConsequencesOfAction(String consequencesOfAction) {
		this.consequencesOfAction = consequencesOfAction;
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
        Report other = (Report) obj;
        if (crisisID != other.crisisID)
            return false;
        return true;
    }
 
    @Override
	public String toString() {
		return "Report [crisisID=" + crisisID + ", positionInCMO=" + positionInCMO + ", threatLevel=" + threatLevel
				+ ", affectedAreas=" + affectedAreas + ", estimatedCasualties=" + estimatedCasualties
				+ ", crisisDuration=" + crisisDuration + ", courseOfActions=" + courseOfActions
				+ ", consequencesOfAction=" + consequencesOfAction + "]";
	}
 
 
}