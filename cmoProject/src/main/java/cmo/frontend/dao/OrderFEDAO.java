package cmo.frontend.dao;

import java.util.List;

import cmo.entities.EFOrder;

public interface OrderFEDAO {

	public EFOrder saveNewOrder(EFOrder order);

	public EFOrder getByOrderId(long orderId);

	public List<EFOrder> getAll();

	public List<EFOrder> getAllByCrisisId(long crisisId);
}
