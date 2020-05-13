package com.share.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.share.entity.ItemsEntity;
import com.share.repository.ItemsRepository;

@Service
public class ItemsBusiness implements ItemsService{
	
	@Autowired
	private ItemsRepository itemsRepository;


	public ItemsEntity finditemsById(Integer id) {
		return itemsRepository.findById(id);
	}

	public List<ItemsEntity> findAllitems() {
		return itemsRepository.findAll();
	}

	public ItemsEntity activeitems(Integer id) {
		int flag = itemsRepository.activeItems(id);
		return itemsRepository.findById(id);
	}
	




}
