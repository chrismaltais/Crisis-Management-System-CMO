package cmo.entities;

import java.util.Base64;

public class ApprovalReportConverter {

	public static ApprovalReport convert(ApprovalReportDTO e) {
		if (e == null)
			return null;
		ApprovalReport report = new ApprovalReport();
		report.setCrisisID(e.getCrisisID());
		report.setPdfBase64(Base64.getEncoder().encode(Base64.getDecoder().decode(e.getPdfBase64())));
		return report;
	}

	public static ApprovalReportDTO convert(ApprovalReport e) {
		if (e == null)
			return null;
		ApprovalReportDTO report = new ApprovalReportDTO();
		report.setCrisisID(e.getCrisisID());
		report.setPdfBase64(Base64.getEncoder().encodeToString(Base64.getDecoder().decode(e.getPdfBase64())));
		return report;
	}
}
