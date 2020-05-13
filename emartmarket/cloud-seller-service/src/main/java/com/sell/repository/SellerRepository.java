package com.sell.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sell.entity.SellerEntity;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity, Integer>{
	
	public SellerEntity findById(Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "update e_seller u set u.GSTIN='123' where u.id=?",nativeQuery = true)
	public int activeSeller(@Param("id")Integer id);
}