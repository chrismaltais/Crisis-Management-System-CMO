package cmo.entities;

import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

/**
 * Approval Report from PMO
 *
 */

@Entity
public class ApprovalReport {

	@Id
	private long crisisID;
	@Lob
	private byte[] pdfBase64;
	@CreationTimestamp
	private Timestamp messageReceivedTime;
	private boolean read = false;
	private boolean analysisReadable = false;

	public ApprovalReport() {
		crisisID = 0;
	}

	public ApprovalReport(long crisisID, byte[] pdfBase64, Timestamp messageReceivedTime, boolean read,
			boolean analysisReadable) {
		this.crisisID = crisisID;
		this.pdfBase64 = pdfBase64;
		this.messageReceivedTime = messageReceivedTime;
		this.read = read;
		this.analysisReadable = analysisReadable;
	}

	public long getCrisisID() {
		return crisisID;
	}

	public void setCrisisID(long crisisID) {
		this.crisisID = crisisID;
	}

	public byte[] getPdfBase64() {
		return pdfBase64;
	}

	public void setPdfBase64(byte[] pdfBase64) {
		this.pdfBase64 = pdfBase64;
	}

	public Timestamp getMessageReceivedTime() {
		return messageReceivedTime;
	}

	public void setMessageReceivedTime(Timestamp messageReceivedTime) {
		this.messageReceivedTime = messageReceivedTime;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isAnalysisReadable() {
		return analysisReadable;
	}

	public void setAnalysisReadable(boolean analysisReadable) {
		this.analysisReadable = analysisReadable;
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
		return "ApprovalReport [crisisID=" + crisisID + ", pdfBase64=" + Arrays.toString(pdfBase64)
				+ ", messageReceivedTime=" + messageReceivedTime + ", read=" + read + ", analysisReadable="
				+ analysisReadable + "]";
	}

}