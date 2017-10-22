package cmo.entities;

public class ApprovalReportDTO {

	private long crisisID;
	private String pdfBase64;

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
	
	public void setPdfBase64(byte[] pdfBase64) {
		this.pdfBase64 = pdfBase64.toString();
	}
	
	public ApprovalReport getApprovalReport() {
		ApprovalReport report = new ApprovalReport();
		report.setCrisisID(this.getCrisisID());
		report.setPdfBase64(PDFtoByte(this.getPdfBase64()));
		return report;
	}
	
	private byte[] PDFtoByte(String input) {

		String[] byteValues = input.substring(1, input.length() - 1).split(",");
		byte[] bytes = new byte[byteValues.length];

		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = Byte.parseByte(byteValues[i].trim());
		}

		return bytes;
	}

}