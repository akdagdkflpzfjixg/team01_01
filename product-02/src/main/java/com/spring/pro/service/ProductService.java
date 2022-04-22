package com.spring.pro.service;

import java.util.Map;

import com.spring.pro.domain.Product;

public interface ProductService {
	
	public abstract Map<String,Object> productList(int pageNum);
	
	public abstract Product getProduct(int no);
	
	public abstract void insertProduct(Product product);
	
	public abstract void deleteProduct(int no);
	
	public abstract void updateProduct(Product product);
	
	public boolean isPassCheck(int no, String pass);
}
