package cmo.frontend.dao;

import java.util.List;

import cmo.entities.ApprovalReport;

public interface ApprovalReportFEDAO {

	// returns file link for report id
	public String getReportByCrisisId(long crisisId);
	
	// returns all available reports
	public List<ApprovalReport> getAllReports();
}
