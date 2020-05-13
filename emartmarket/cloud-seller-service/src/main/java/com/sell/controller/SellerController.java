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

import com.sell.entity.SellerEntity;
import com.sell.model.SellerModel;
import com.sell.service.SellerService;

@RestController
@RequestMapping("/api/seller")
//@CrossOrigin(origins="http://localhost:4200")
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<SellerEntity> findAllSeller(){
		
		return sellerService.findAllSeller();
	}
	@PostMapping
	public ResponseEntity<SellerEntity> regist(SellerEntity seller){
		SellerEntity sellerEntity = sellerService.registSeller(seller);
		return ResponseEntity.status(HttpStatus.CREATED).body(sellerEntity); 
	}
	
	@PutMapping
	public ResponseEntity<SellerEntity> update(SellerEntity seller){
		SellerEntity sellerEntity = sellerService.updateSeller(seller);
		return ResponseEntity.ok(sellerEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<SellerEntity> active(@PathVariable Integer id){
		SellerEntity seller = sellerService.activeSeller(id);
		return ResponseEntity.ok(seller); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		sellerService.delete(id);
		return ResponseEntity.ok("Delete seller(e_seller) successfully.");
	}
	
	
}
