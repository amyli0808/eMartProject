package com.share.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.share.entity.ItemsEntity;

public interface ItemsService {


	public List<ItemsEntity> findAllitems();

	public ItemsEntity finditemsById(Integer id);
	
	
	public ItemsEntity activeitems(Integer id);
	

}
