package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Report;

/**
 * Repository for Report entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ReportRepository extends CrudRepository<Report, Long> {

	public Report findByCrisisID(int id);
}
