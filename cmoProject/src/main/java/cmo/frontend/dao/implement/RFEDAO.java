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
	public Report getByCrisisId(long crisisId) {
		return repo.findByCrisisID(crisisId);
	}

	@Override
	public List<Report> getAll() {
		return repo.findAll();
	}

}
