package com.sell.service;

import java.util.List;
import org.springframework.data.domain.Page;

import com.sell.entity.ItemsEntity;

public interface ItemsService {

	/**
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<ItemsEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<ItemsEntity> findAllitems();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public ItemsEntity finditemsById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param user
	 * @return
	 */
	public ItemsEntity updateitems(ItemsEntity items);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public ItemsEntity activeitems(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
	
	
	
	public ItemsEntity registitems(ItemsEntity items);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param user
	 * @return
	 */
}
