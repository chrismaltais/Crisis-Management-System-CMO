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

	public GeneralOrder findByGeneralOrderID(long generalOrderId);
	
	public List<GeneralOrder> findAll();
	
	public List<GeneralOrder> findByCrisisIDOrderByCrisisIDDesc(long crisisId);
}
