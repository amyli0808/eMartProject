package com.admin.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.admin.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	public UserEntity findById(Integer id);
	
	@Modifying
	@Transactional
	@Query(value = "update e_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id")Integer id);
}
