package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.EFOrder;
import cmo.frontend.dao.OrderFEDAO;
import cmo.repository.OrderRepository;

@Service
public class OFEDAO implements OrderFEDAO {

	@Autowired
	private OrderRepository repo;
	
	@Override
	public EFOrder saveNewOrder(EFOrder order) {
		repo.save(order);
		return repo.findTop1ByOrderByEfOrderIDDesc();
	}

	@Override
	public EFOrder getByOrderId(long orderId) {
		EFOrder order = repo.findByEfOrderID(orderId);
		order.setRead(true);
		repo.save(order);
		return repo.findByEfOrderID(orderId);
	}

	@Override
	public List<EFOrder> getAll() {
		return repo.findAll();
	}

	@Override
	public List<EFOrder> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCrisisIDDesc(crisisId);
	}

}
