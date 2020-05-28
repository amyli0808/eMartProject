package com.shop.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.entity.ProductsEntity;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Integer>{
	
	public ProductsEntity findById(Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "update e_products u set u.PRICE='123' where u.id=?",nativeQuery = true)
	public int activeProducts(@Param("id")Integer id);
}