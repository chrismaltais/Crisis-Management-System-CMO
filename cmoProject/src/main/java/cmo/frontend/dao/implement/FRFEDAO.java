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
	public FeedbackReport getByFeedbackReportId(long feedbackReportId) {
		FeedbackReport report = repo.findByFeedbackReportID(feedbackReportId);
		report.setRead(true);
		repo.save(report);
		return repo.findByFeedbackReportID(feedbackReportId);
	}

	@Override
	public List<FeedbackReport> getAll() {
		return repo.findAll();
	}

	@Override
	public List<FeedbackReport> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCrisisIDDesc(crisisId);
	}

}
