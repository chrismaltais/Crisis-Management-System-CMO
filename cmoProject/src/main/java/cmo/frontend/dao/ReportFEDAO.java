package cmo.frontend.dao;

import java.util.List;

import cmo.entities.Report;

public interface ReportFEDAO {

	public Report getByReportId(long reportId);

	public List<Report> getAll();

	public List<Report> getAllByCrisisId(long crisisId);
}
