package com.share.controller;

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

import com.share.entity.ItemsEntity;
import com.share.service.ItemsService;
import com.share.model.ItemsModel;

@RestController
@RequestMapping("/api/share/items")
//@CrossOrigin(origins="http://localhost:4200")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	/**
	 * findAllItems
	 */
	@GetMapping
	public List<ItemsEntity> findAllItems(){		
		return itemsService.findAllitems();
	}
	/**
	 * finditemsById
	 */	
	
	@GetMapping("/active/{id}")
	public ResponseEntity<ItemsEntity> active(@PathVariable Integer id){
		ItemsEntity items = itemsService.activeitems(id);
		return ResponseEntity.ok(items); 
	}
	
	
	
}
