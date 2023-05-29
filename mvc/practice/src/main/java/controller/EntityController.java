package controller;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Entityclass;
import services.EntityServices;
@RestController 
@RequestMapping("/api")
@Table(name="emp_details")
public class EntityController {

	
		@Autowired
		 EntityServices services;
		
		@PostMapping("/api")
		public Entityclass addempl(@RequestBody Entityclass addemp) {
			return services.addemployee(addemp);
		}
		@GetMapping("/retrieve/{id}")
		public Entityclass retrive(@PathVariable Long id) {
			return services.getbyid(id);
		}
		
		@GetMapping("/retrieve")
		public List<Entityclass> getall(){
			return services.getall();
		}
		
		@DeleteMapping("/delete")
		public String del(@PathVariable Long id) {
			return services.delete(id);
		}
		
	}	

