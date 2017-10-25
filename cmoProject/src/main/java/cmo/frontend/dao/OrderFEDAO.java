package cmo.frontend.dao;

import java.util.List;

import cmo.entities.GeneralOrder;

public interface OrderFEDAO {

	public GeneralOrder getByCrisisId(long crisisID);

	public List<GeneralOrder> getAll();
}
