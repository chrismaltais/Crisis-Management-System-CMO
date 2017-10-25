package cmo.entities;

public class ApprovalReportDTO {

	private long crisisID;
	private String pdfBase64;

	public ApprovalReportDTO() {
	}

	public ApprovalReportDTO(long crisisID, String pdfBase64) {
		this.crisisID = crisisID;
		this.pdfBase64 = pdfBase64;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public String getPdfBase64() {
		return pdfBase64;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setPdfBase64(String pdfBase64) {
		this.pdfBase64 = pdfBase64;
	}

	@Override
	public String toString() {
		return "ApprovalReportDTO [crisisID=" + crisisID + ", pdfBase64=" + pdfBase64 + "]";
	}

}