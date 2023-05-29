package com.ust.responses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.responses.Repository.responseRepository;
import com.ust.responses.model.Response;

@RestController
@RequestMapping("/response")
public class responseController {

	@Autowired
	responseRepository repo;
	
	@PostMapping("/create")
	public ResponseEntity<?> addproduct( @RequestBody Response res){
		Response op=repo.save(res);
		return  ResponseEntity.ok().body(op);
	}
	
	
    @GetMapping("/getall")
    public List<Response> getproduct(){
   	 return repo.findAll();
	}
    
    
    @GetMapping("/getall/{id}")
    public ResponseEntity<?> getbyid(@PathVariable Long id){
    	Optional<Response> op=repo.findById(id);
    	if(op.isPresent()) {
    	return ResponseEntity.ok().body(op);
    	}else
    		return null;
    }
    
    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Response res){
    	Response op=repo.save(res);
    	return ResponseEntity.ok().body(op);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateid(@PathVariable Long id,@RequestBody Response res){
        Response emp=null;
        Response rep=null;
    	Optional<Response> op=repo.findById(id);
    	if(op.isPresent()) {
    		emp=op.get();
    	emp.setDept(res.getDept());
    	emp.setName(res.getName());
    	 rep=repo.save(emp);
    	}
    	return ResponseEntity.ok().body(rep);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteid(@PathVariable Long id) {
    	Optional<Response> op=repo.findById(id);
        if(op.isEmpty()) {
        	repo.deleteById(id);
        }
        return "deleted..........";
        
    }
}
