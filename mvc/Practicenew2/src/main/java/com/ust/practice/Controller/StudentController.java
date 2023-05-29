package com.ust.practice.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.ust.practice.Model.Student;
import com.ust.practice.Repository.StudentRepository;
import com.ust.practice.exceptions.IdNotFoundException;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository repo;

@PostMapping("/create")
public ResponseEntity<?> add(@RequestBody Student st){
	return ResponseEntity.ok().body(repo.save(st));
}

@GetMapping("/getall")
public ResponseEntity<List<Student>> getall(){
	return ResponseEntity.ok().body(repo.findAll());
}

@GetMapping("/getall/{id}")
public ResponseEntity<?> getid(@PathVariable Long id) throws IdNotFoundException{
	Optional<Student> op=repo.findById(id);
	if(op.isPresent()) {
		return ResponseEntity.ok().body(op);
	}
	else
		throw new IdNotFoundException("id not found try other......");
}

@PutMapping("/update")
public ResponseEntity<?> update(@RequestBody Student st){
	return ResponseEntity.ok().body(repo.save(st));
}
@PutMapping("/update/{id}")
public ResponseEntity<?> updateid(@PathVariable Long id,@RequestBody Student st) throws IdNotFoundException{
	Student s=null;
	Optional<Student> op=repo.findById(id);
	if(op.isPresent()) {
		s=op.get();
		s.setName(st.getName());
		s.setDept(st.getDept());
		return ResponseEntity.ok().body(s);
	}
	else
		throw new IdNotFoundException("id not found try other......");
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable Long id)throws IdNotFoundException{
	Optional<Student> op= repo.findById(id);
	if(op.isPresent()) {
	repo.deleteById(id);
	return ResponseEntity.ok().body("deleted..............");
	}
	else
		throw new IdNotFoundException("id not found try other......");
	}
}
