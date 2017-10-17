package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Order;

/**
 * Repository for Order entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

	public Order findByCrisisID(int id);
}
