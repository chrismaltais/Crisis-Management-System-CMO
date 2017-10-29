package cmo.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;

@Service
public class PDFConverterApprovalReport implements PDFConverter {
	
	@Override
	public String convertToPdf(Object o){
		ApprovalReport report = (ApprovalReport) o;
		Base64 b = new Base64();
    	byte[] imageBytes = b.decode(report.getPdfBase64());

		String FILEPATH = "ApprovalReport-" + report.getCrisisID() + ".pdf";
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(FILEPATH);
		} catch (FileNotFoundException e) {
			e.getMessage();
			return null;
		}
		try {
			fout.write(imageBytes);
			fout.close();
		} catch (IOException e) {
			e.getMessage();
			return null;
		}
		return FILEPATH;
	}

}
