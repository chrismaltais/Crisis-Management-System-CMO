package cmo.pdf;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;

@Service("approvalPDF")
public class PDFConverterApprovalReport implements PDFConverter<ApprovalReport> {
	// according to project's Java Build Path, this should refer to root folder
	private final String BASEPATH = "src/main/webapp/";

	@Override
	public String convertToPdf(ApprovalReport report) {
		String FILENAME = "Approval-" + report.getCrisisID() + ".pdf";
		
		try {
			Files.write(Paths.get(BASEPATH + FILENAME), Base64.getDecoder().decode(report.getPdfBase64()));
		} catch (Exception e) {
			FILENAME = "";
			e.printStackTrace();
		}
		
		return FILENAME;
	}

	@Override
	public ApprovalReport convertToByteArray(ApprovalReport report, String filepath) {
		try {
			report.setPdfBase64(Base64.getEncoder().encode(Files.readAllBytes(Paths.get(BASEPATH + filepath))));
		} catch (Exception e) {
			report = null;
			e.printStackTrace();
		}
		
		return report;
	}

}
