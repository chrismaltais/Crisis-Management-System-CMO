package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Report;

/**
 * Repository for Report entity
 *
 */
public interface ReportRepository extends CrudRepository<Report, Long> {

	public Report findByReportID(long reportId);

	public List<Report> findAll();

	public List<Report> findByCrisisIDOrderByCrisisIDDesc(long crisisId);
}
