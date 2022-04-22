package com.spring.pro.dao;

import java.util.List;

import com.spring.pro.domain.Product;

public interface ProductDao {
	
	//게시글 띄우기
	public abstract List<Product> productList(int startRow, int num);
	
	//게시글 총 개수
	public abstract int getProductCount();
	
	// 세부정보
	public abstract Product getProduct (int no); 
	
	//게시글 추가
	public abstract void insertProduct(Product product); 
	
	//게시글 수정
	public abstract void updateProduct(Product product);
	
	//게시글 삭제
	public abstract void deleteProduct(int no);
	
	//비밀번호 확인
	public boolean isPassCheck(int no, String pass);
}
