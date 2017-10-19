package cmo.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApprovalReport {

	@Id
	private long crisisID;
	private byte[] pdfBase64;

	public ApprovalReport() {
		crisisID = 0;
	}

	public ApprovalReport(long crisisID, byte[] pdfBase64) {
		this.crisisID = crisisID;
		this.pdfBase64 = pdfBase64;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public byte[] getPdfBase64() {
		return pdfBase64;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public void setPdfBase64(byte[] pdfBase64) {
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
		return "ApprovalReport [crisisID=" + crisisID + ", pdfBase64=" + Arrays.toString(pdfBase64) + "]";
	}

	public byte[] PDFtoByte(String input) {

		String[] byteValues = input.substring(1, input.length() - 1).split(",");
		byte[] bytes = new byte[byteValues.length];

		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = Byte.parseByte(byteValues[i].trim());
		}

		return bytes;
	}
	
	public String PDFtoString(byte[] input) {
		return input.toString();
	}

}