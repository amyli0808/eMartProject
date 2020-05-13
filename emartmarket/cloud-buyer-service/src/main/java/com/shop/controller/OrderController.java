package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entity.OrderEntity;
import com.shop.service.OrderService;

@RestController
@RequestMapping("/api/order")
//@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<OrderEntity> findAllOrder(){
		
		return orderService.findAllOrder();
	}
	@PostMapping
	public ResponseEntity<OrderEntity> regist(OrderEntity order){
		OrderEntity orderEntity = orderService.registOrder(order);
		return ResponseEntity.status(HttpStatus.CREATED).body(orderEntity); 
	}
	
	@PutMapping
	public ResponseEntity<OrderEntity> update(OrderEntity order){
		OrderEntity orderEntity = orderService.updateOrder(order);
		return ResponseEntity.ok(orderEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<OrderEntity> active(@PathVariable Integer id){
		OrderEntity order = orderService.activeOrder(id);
		return ResponseEntity.ok(order); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		orderService.delete(id);
		return ResponseEntity.ok("Delete order successfully.");
	}
	
	
}
