package cmo.frontend.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cmo.entities.ApprovalReport;
import cmo.entities.FeedbackReport;

public interface ApprovalReportFEDAO {

	// returns file link for report id
	public ApprovalReport getReportByCrisisId(long crisisId);

	// returns all available reports
	public List<ApprovalReport> getAllReports();
}
