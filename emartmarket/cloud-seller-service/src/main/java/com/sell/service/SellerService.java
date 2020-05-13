package com.sell.service;

import java.util.List;
import org.springframework.data.domain.Page;

import com.sell.entity.SellerEntity;

public interface SellerService {

	/**
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<SellerEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<SellerEntity> findAllSeller();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public SellerEntity findSellerById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param user
	 * @return
	 */
	public SellerEntity updateSeller(SellerEntity seller);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public SellerEntity activeSeller(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
	
	
	
	public SellerEntity registSeller(SellerEntity seller);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param user
	 * @return
	 */
}
