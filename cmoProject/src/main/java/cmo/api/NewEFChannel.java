package cmo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cmo.entities.EFOrder;
import cmo.repository.OrderRepository;

@RestController
@RequestMapping("/CMOtoEF")
public class NewEFChannel {

	@Autowired
	private OrderRepository repo;

	@GetMapping("/order/latest")
	public EFOrder getLatestOrder() {
		return repo.findTop1ByOrderByEfOrderIDDesc();
	}
}
