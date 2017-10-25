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
	public GeneralOrder getByCrisisId(long crisisID) {
		return repo.findByCrisisID(crisisID);
	}

	@Override
	public List<GeneralOrder> getAll() {
		return repo.findAll();
	}

}
