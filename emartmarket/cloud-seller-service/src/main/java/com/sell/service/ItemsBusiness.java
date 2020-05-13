package com.sell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sell.entity.ItemsEntity;
import com.sell.repository.ItemsRepository;

@Service
public class ItemsBusiness implements ItemsService{
	
	@Autowired
	private ItemsRepository itemsRepository;

	public Page<ItemsEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemsEntity finditemsById(Integer id) {
		return itemsRepository.findById(id);
	}

	public List<ItemsEntity> findAllitems() {
		return itemsRepository.findAll();
	}
	
	/**
	 * about items
	 */
	public ItemsEntity registitems(ItemsEntity items){
		return itemsRepository.saveAndFlush(items);
	}

	/**
	 * items JPA ID
	 */
	public ItemsEntity update(ItemsEntity items) {
		return itemsRepository.save(items);
	}

	public ItemsEntity updateitems(ItemsEntity items) {
		// TODO Auto-generated method stub
		return itemsRepository.save(items);
	}
	
	public ItemsEntity activeitems(Integer id) {
		int flag = itemsRepository.activeItems(id);
		return itemsRepository.findById(id);
	}

	public void delete(Integer id) {
		itemsRepository.delete(id);
	}



}
