package com.sell.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sell.entity.ItemsEntity;;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, Integer>{
	
	public ItemsEntity findById(Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "update e_items u set u.REMARK='itemsok' where u.id=?",nativeQuery = true)
	public int activeItems(@Param("id")Integer id);
	
}