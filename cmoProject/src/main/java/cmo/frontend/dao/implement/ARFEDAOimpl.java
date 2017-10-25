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
	public String getReport(long id) {
		ApprovalReport report = repo.findByCrisisID(id);
		return converter.convertToPdf(report);
	}

	@Override
	public long[] getReportList() {
		List<ApprovalReport> reports = repo.findAll();
		long[] list = new long[reports.size()];
		for (int i = 0; i < list.length; i++) {
			list[i] = reports.get(i).getCrisisID();
		}
		return list;
	}

}
