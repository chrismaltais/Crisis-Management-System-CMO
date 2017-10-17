package cmo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApprovalReport {
	
	@Id
	private long crisisID;
	private String pdfBase64;
 
	public ApprovalReport(){
        crisisID=0;
    }

	public ApprovalReport(long crisisID, String pdfBase64) {
		this.crisisID = crisisID;
		this.pdfBase64 = pdfBase64;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public String getPdfBase64() {
		return pdfBase64;
	}

	public void setPdfBase64(String pdfBase64) {
		this.pdfBase64 = pdfBase64;
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
        ApprovalReport other = (ApprovalReport) obj;
        if (crisisID != other.crisisID)
            return false;
        return true;
    }
 
    @Override
	public String toString() {
		return "Report [crisisID=" + crisisID + ", pdfBase64=" + pdfBase64 + "]";
	}
 
 
}