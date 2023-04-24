package com.ust.rest.resource;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;
//@Entity
//@GeneratedValue(strategy=GenerationType.IDENTITY)
// generation type is the strategy which the JPI should use or follow to generate primary key value.
//the default generation type is AUTO,when strategy is not specified jpA uses auto strategy.
//when the underline database is mysql generation type.auto means the jpA will create a hibernate sequence in the database for generation of primary keys
//Hibernate: select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
//GenerationType.identity for this strategy to work first we have to create a table in mysql and explicitly specifies the autoincrement column as checkrd for the primary key column
//and in application.properties file #Spring.jpa.hibernate.ddl-auto=update they should not be set if it is set ,value as update

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
@Id
private String _id;
private String name;
private String description;
private BigDecimal price;
private int qty;

}

//public long getProductId() {
//	return productId;
//}
//public void setProductId(long productId) {
//	this.productId = productId;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public String getDescription() {
//	return description;
//}
//public void setDescription(String description) {
//	this.description = description;
//}
//public BigDecimal getPrice() {
//	return price;
//}
//public void setPrice(BigDecimal price) {
//	this.price = price;
//}
//public int getQty() {
//	return qty;
//}
//public void setQty(int qty) {
//	this.qty = qty;
//}

