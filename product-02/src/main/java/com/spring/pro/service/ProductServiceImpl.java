package com.spring.pro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pro.dao.ProductDao;
import com.spring.pro.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private static final int PAGE_SIZE = 10;
	private static final int PAGE_GROUP = 10;

	@Autowired
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Map<String, Object> productList(int pageNum) {
		int currentPage = pageNum;

		int startRow = (currentPage - 1) * PAGE_SIZE;
		int listCount = productDao.getProductCount();

		List<Product> productList = productDao.productList(startRow, PAGE_SIZE);

		int pageCount = listCount / PAGE_SIZE + (listCount % PAGE_SIZE == 0 ? 0 : 1);
		int startPage = (currentPage / PAGE_GROUP) * PAGE_GROUP + 1 - (currentPage % PAGE_GROUP == 0 ? PAGE_GROUP : 0);

		int endPage = startPage + PAGE_GROUP - 1;

		if (endPage > pageCount) {
			endPage = pageCount;
		}

		Map<String, Object> modelMap = new HashMap<String, Object>();

		modelMap.put("productList", productList);
		modelMap.put("pageCount", pageCount);
		modelMap.put("startPage", startPage);
		modelMap.put("endPage", endPage);
		modelMap.put("currentPage", currentPage);
		modelMap.put("listCount", listCount);
		modelMap.put("pageGroup", PAGE_GROUP);

		return modelMap;
	}

	@Override
	public Product getProduct(int no) {
		return productDao.getProduct(no);
	}

	@Override
	public void insertProduct(Product product) {
		productDao.insertProduct(product);
	}

	@Override
	public void deleteProduct(int no) {
		productDao.deleteProduct(no);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.updateProduct(product);
	}

	@Override
	public boolean isPassCheck(int no, String pass) {
		return productDao.isPassCheck(no, pass);
	}

}
