package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Entityclass;
import repository.EntityRepo;
@Service
public class EntityServices {
	@Autowired
	EntityRepo Repo;

	public Entityclass addemployee(Entityclass addemp) {
		// TODO Auto-generated method stub
		return Repo.save(addemp);
	}

	public Entityclass getbyid(Long id) {
		// TODO Auto-generated method stub
		return Repo.findById(id).orElse(null);
	}

	public List<Entityclass> getall() {
		// TODO Auto-generated method stub
		return Repo.findAll();
	}

	public String delete(Long id) {
		// TODO Auto-generated method stub
	   Repo.deleteById(id);
	   return "deleted........";
	}
	




}
