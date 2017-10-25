package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.FeedbackReport;
import cmo.frontend.dao.FeedbackReportFEDAO;
import cmo.repository.FeedbackReportRepository;

@Service
public class FRFEDAO implements FeedbackReportFEDAO {
	
	@Autowired
	private FeedbackReportRepository repo;

	@Override
	public FeedbackReport getReportByCrisisId(long crisisID) {
		return repo.findByCrisisID(crisisID);
	}

	@Override
	public List<FeedbackReport> getAll() {
		return repo.findAll();
	}

}
