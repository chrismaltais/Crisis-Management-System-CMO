package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.Report;
import cmo.frontend.dao.ReportFEDAO;
import cmo.repository.ReportRepository;

@Service
public class RFEDAO implements ReportFEDAO {

	@Autowired
	private ReportRepository repo;

	@Override
	public Report getByReportId(long reportId) {
		Report report = repo.findByReportID(reportId);
		report.setRead(true);
		repo.save(report);
		return repo.findByReportID(reportId);
	}

	@Override
	public List<Report> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Report> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCrisisIDDesc(crisisId);
	}

}
