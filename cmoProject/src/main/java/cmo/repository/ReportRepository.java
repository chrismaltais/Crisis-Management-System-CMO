package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Report;

/**
 * Repository for Report entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ReportRepository extends CrudRepository<Report, Long> {

	public Report findByCrisisID(long id);

	public List<Report> findAll();
}
