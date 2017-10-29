package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;
import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.pdf.PDFConverter;
import cmo.repository.ApprovalReportRepository;

@Service
public class ARFEDAOimpl implements ApprovalReportFEDAO {

	@Autowired
	ApprovalReportRepository repo;
	@Autowired
	PDFConverter converter;

	@Override
	public String getReportByCrisisId(long crisisId) {
		ApprovalReport report = repo.findByCrisisID(crisisId);
		return converter.convertToPdf(report);
	}

	@Override
	public List<ApprovalReport> getAllReports() {
		return repo.findAllByOrderByCrisisIDDesc();
	}

}
