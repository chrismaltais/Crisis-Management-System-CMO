package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;
import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.repository.ApprovalReportRepository;

@Service
public class ARFEDAO implements ApprovalReportFEDAO {

	@Autowired
	ApprovalReportRepository repo;

	@Override
	public ApprovalReport getReportByCrisisId(long crisisId) {
		ApprovalReport report = repo.findByCrisisID(crisisId);
		report.setRead(true);
		repo.save(report);
		return repo.findByCrisisID(crisisId);
	}

	@Override
	public List<ApprovalReport> getAllReports() {
		return repo.findAll();
	}
	
	@Override
	public void setAnalysisReadable(long crisisID, boolean readable) {
		ApprovalReport report = repo.findByCrisisID(crisisID);
		report.setAnalysisReadable(readable);
		repo.save(report);
	}
	
	@Override
	public List<ApprovalReport> getAllAnalysisReadableReports(){
		return repo.findByAnalysisReadableOrderByCrisisIDDesc(true);
	}

}
