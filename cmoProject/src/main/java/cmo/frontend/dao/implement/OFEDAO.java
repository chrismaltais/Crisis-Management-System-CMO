package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.GeneralOrder;
import cmo.frontend.dao.OrderFEDAO;
import cmo.repository.OrderRepository;

@Service
public class OFEDAO implements OrderFEDAO {

	@Autowired
	private OrderRepository repo;

	@Override
	public GeneralOrder getByOrderId(long orderId) {
		GeneralOrder order = repo.findByGeneralOrderID(orderId);
		order.setRead(true);
		repo.save(order);
		return repo.findByGeneralOrderID(orderId);
	}

	@Override
	public List<GeneralOrder> getAll() {
		return repo.findAll();
	}

	@Override
	public List<GeneralOrder> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCrisisIDDesc(crisisId);
	}

}
