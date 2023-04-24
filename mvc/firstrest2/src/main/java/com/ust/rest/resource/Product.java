package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;  
import lombok.NoArgsConstructor;  
import lombok.Setter;  
import lombok.ToString;  
@Getter
@Setter
public class Product  
{  
@Getter
@Setter
private  long productId;  
private  String name;  
private  String description;  
private  BigDecimal price;  
private int qty;
}  



