package cmo.pdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cmo.entities.ApprovalReport;

public class PDFConverterApprovalReport implements PDFConverter {

	@Override
	public String convertToPdf(Object o){
		ApprovalReport report = (ApprovalReport) o;
		byte[] bytefile = report.getPdfBase64();
		String FILEPATH = "approvalReport.pdf";
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(FILEPATH);
		} catch (FileNotFoundException e) {
			e.getMessage();
			return null;
		}
		try {
			fout.write(bytefile);
			fout.close();
		} catch (IOException e) {
			e.getMessage();
			return null;
		}
		return FILEPATH;
	}

}
