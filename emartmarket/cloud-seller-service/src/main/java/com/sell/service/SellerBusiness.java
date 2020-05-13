package com.sell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sell.entity.SellerEntity;
import com.sell.repository.SellerRepository;;

@Service
public class SellerBusiness implements SellerService{
	
	@Autowired
	private SellerRepository sellerRepository;

	public Page<SellerEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public SellerEntity findSellerById(Integer id) {
		return sellerRepository.findById(id);
	}

	public List<SellerEntity> findAllSeller() {
		return sellerRepository.findAll();
	}
	
	/**
	 * about seller
	 */
	public SellerEntity registSeller(SellerEntity seller){
		return sellerRepository.saveAndFlush(seller);
	}

	/**
	 * SELLER JPA ID
	 */
	public SellerEntity update(SellerEntity seller) {
		return sellerRepository.save(seller);
	}

	public SellerEntity updateSeller(SellerEntity seller) {
		// TODO Auto-generated method stub
		return sellerRepository.save(seller);
	}
	
	public SellerEntity activeSeller(Integer id) {
		int flag = sellerRepository.activeSeller(id);
		return sellerRepository.findById(id);
	}

	public void delete(Integer id) {
		sellerRepository.delete(id);
	}

}
