package cmo.frontend.dao;

import java.util.List;

import cmo.entities.ApprovalReport;

public interface ApprovalReportFEDAO {

	// returns file link for report id
	public String getReport(long id);
	
	// returns array of id of available reports
	public List<ApprovalReport> getAllReports();
}
