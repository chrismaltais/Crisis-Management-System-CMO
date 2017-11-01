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
		return repo.findByCrisisID(crisisId);
	}

	@Override
	public List<ApprovalReport> getAllReports() {
		return repo.findAll();
	}

}
