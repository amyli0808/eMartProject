package com.sell.controller;

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

import com.sell.entity.ItemsEntity;
import com.sell.model.SellerModel;
import com.sell.service.ItemsService;
import com.sell.service.SellerService;

@RestController
@RequestMapping("/api/items")
//@CrossOrigin(origins="http://localhost:4200")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<ItemsEntity> findAllItems(){		
		return itemsService.findAllitems();
	}
	
	@PostMapping
	public ResponseEntity<ItemsEntity> regist(ItemsEntity items){
		ItemsEntity itemsEntity = itemsService.registitems(items);
		return ResponseEntity.status(HttpStatus.CREATED).body(itemsEntity); 
	}
	
	@PutMapping
	public ResponseEntity<ItemsEntity> update(ItemsEntity items){
		ItemsEntity itemsEntity = itemsService.updateitems(items);
		return ResponseEntity.ok(itemsEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<ItemsEntity> active(@PathVariable Integer id){
		ItemsEntity items = itemsService.activeitems(id);
		return ResponseEntity.ok(items); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		itemsService.delete(id);
		return ResponseEntity.ok("Delete items(e_items) successfully.");
	}
	
	
}
