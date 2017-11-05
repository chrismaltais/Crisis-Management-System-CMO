package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.EFOrder;

/**
 * Repository for Order entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface OrderRepository extends CrudRepository<EFOrder, Long> {

	public EFOrder findByEfOrderID(long efOrderId);
	
	public List<EFOrder> findAll();
	
	public List<EFOrder> findByCrisisIDOrderByCrisisIDDesc(long crisisId);
	
	public EFOrder findTop1ByOrderByEfOrderIDDesc();
}
