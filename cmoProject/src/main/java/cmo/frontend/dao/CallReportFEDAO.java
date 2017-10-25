package cmo.frontend.dao;

import java.util.List;

import cmo.entities.CallReport;

public interface CallReportFEDAO {

	// get specific call report by id
	public CallReport getReport(long callReportId);
	
	// get list of call reports starting with the latest
	public List<CallReport> getAll();
	
	// get list of call reports for crisisID starting from the latest
	public List<CallReport> getAllByID(long crisisId);
}
