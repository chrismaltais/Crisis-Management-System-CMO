package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.CallReport;
import cmo.frontend.dao.CallReportFEDAO;
import cmo.repository.CallReportRepository;

@Service
public class CREFDAO implements CallReportFEDAO {

	@Autowired
	CallReportRepository repo;

	@Override
	public CallReport getReport(long id) {
		CallReport report = repo.findByCallReportID(id);
		report.setRead(true);
		repo.save(report);
		return repo.findByCallReportID(id);
	}

	@Override
	public List<CallReport> getAll() {
		return repo.findAllByOrderByCallReportIDDesc();
	}

	@Override
	public List<CallReport> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCallReportIDDesc(crisisId);
	}

}
