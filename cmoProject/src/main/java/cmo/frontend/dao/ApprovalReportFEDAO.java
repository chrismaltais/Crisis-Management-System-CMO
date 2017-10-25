package cmo.frontend.dao;

public interface ApprovalReportFEDAO {

	// returns file link for report id
	public String getReport(long id);
	
	// returns array of id of available reports
	public long[] getReportList();
}
