package cmo.frontend.dao;

import java.util.List;

import cmo.entities.GeneralOrder;

public interface OrderFEDAO {

	public GeneralOrder getByOrderId(long orderId);
	
	public List<GeneralOrder> getAll();
	
	public List<GeneralOrder> getAllByCrisisId(long crisisId);
}
