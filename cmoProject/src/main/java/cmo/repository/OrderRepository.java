package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.GeneralOrder;

/**
 * Repository for Order entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface OrderRepository extends CrudRepository<GeneralOrder, Long> {

	public GeneralOrder findByCrisisID(long id);
	
	public List<GeneralOrder> findAll();
}
