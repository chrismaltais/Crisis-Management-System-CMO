package cmo.mailbox.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;
import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.mailbox.MailboxGenerator;

@Service("pmoMailboxGenerator")
public class PMOMailboxGenerator implements MailboxGenerator {
	
	@Autowired
	private ApprovalReportFEDAO dao;

	@Override
	public String generateCode() {
		List<ApprovalReport> reports = dao.getAllReports();
		String content = "";
		int count = 1;
		
		for (ApprovalReport report : reports) {
			// TO-DO
		}
		
		return content;
	}

}
