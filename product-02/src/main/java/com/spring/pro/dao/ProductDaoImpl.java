package com.spring.pro.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.pro.domain.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private final String NAME_SPACE = "com.spring.pro.mapper.ProductMapper";
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	@Override
	  public List<Product> productList(int startRow, int num) { 
		
	  Map<String ,Integer> params = new HashMap<String, Integer>();
	  
	  params.put("startRow",startRow); 
	  params.put("num",num); 
	  
	  return sqlSession.selectList(NAME_SPACE+ ".productList", params); 
	  }
	 

	@Override
	public int getProductCount() {
		return sqlSession.selectOne(NAME_SPACE+".getProductCount");
	}


	@Override
	public Product getProduct(int no) {
		return sqlSession.selectOne(NAME_SPACE + ".getProduct", no);
	}


	@Override
	public void insertProduct(Product product) {
		sqlSession.insert(NAME_SPACE + ".insertProduct", product);
		
	}


	
	  @Override public void updateProduct(Product product) {
	  sqlSession.update(NAME_SPACE + ".updateProduct", product);
	  }
	 


	@Override
	public void deleteProduct(int no) {
		sqlSession.delete(NAME_SPACE + ".deleteProduct", no);
	}


	@Override
	public boolean isPassCheck(int no, String pass) {
		
		boolean result = false;
		
		String dbPass = sqlSession.selectOne(NAME_SPACE + ".isPassCheck", no);
		
		if(dbPass.equals(pass)) {
			result = true;
		}
		return result;
	}

}
