package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;
@Repository
public class ProductRepository {

private ArrayList<Product> productCache=new ArrayList<Product>();

	public ProductRepository() {
		Product p1=new Product();
		p1.setProductId(101);
		p1.setName("laptop");
		p1.setDescription("macbook retina eye");
		p1.setPrice(new BigDecimal(190000));
		p1.setQty(5);
		productCache.add(p1);
		
		Product p2=new Product();
		p2.setProductId(102);
		p2.setName("tablet");
		p2.setDescription("windows");
		p2.setPrice(new BigDecimal(79000));
		p2.setQty(10);
		productCache.add(p2);
		
		Product p3=new Product();
		p3.setProductId(103);
		p3.setName("mobile");
		p3.setDescription("samsung galaxy");
		p3.setPrice(new BigDecimal(45000));
		p3.setQty(7);
		productCache.add(p3);
		
		
		Product p4=new Product();
		p4.setProductId(104);
		p4.setName("tv");
		p4.setDescription("videocon");
		p4.setPrice(new BigDecimal(75000));
		p4.setQty(8);
		productCache.add(p4);
		
		
		Product p5=new Product();
		p5.setProductId(105);
		p5.setName("mobile");
		p5.setDescription("redmi 9");
		p5.setPrice(new BigDecimal(55000));
		p5.setQty(7);
		productCache.add(p5);
		
	}
public boolean addProduct(Product product) {
//	return productCache.add(product);
	if(productCache.add(product)) {
		return true;
	}
	else
		return false;
}

public Product getProduct(long productId) {
	Iterator<Product> iter=productCache.iterator();
	Product product=null;
	while(iter.hasNext()) {
		product=iter.next();
		if(product.getProductId()==productId) {
			break;
		}
	}
		if(product!=null) 
			return product;
		else
			return null;
	}
public ArrayList<Product> getProduct(){
	return productCache;
}
public void delete(long productId) {
	  Iterator<Product>iter=productCache.iterator();
	  int index=0;
	  while(iter.hasNext()) {
		  Product temproduct=iter.next();
		  if(temproduct.getProductId()==productId) {
			  productCache.remove(index);
			 
		  }
		  index++;
	  }
}
public Product updateProduct(Product product) {
	Product searchProduct=null;
	Iterator<Product> iter=productCache.iterator();
	int index=0;
	while(iter.hasNext()) {
		searchProduct=iter.next();
		if(searchProduct.getProductId()==product.getProductId());{
			productCache.add(index, product);
			product=searchProduct;
		}
		index++;
		
	}
	return product;
	
}
}

