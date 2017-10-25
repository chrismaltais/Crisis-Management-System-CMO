package cmo.frontend.dao;

import java.util.List;

import cmo.entities.Report;

public interface ReportFEDAO {

	public Report getByCrisisId(long crisisId);
	
	public List<Report> getAll();
}
