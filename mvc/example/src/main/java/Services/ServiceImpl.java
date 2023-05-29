package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Employee;
import Repositories.EmployeeRepos;

@Service

public class ServiceImpl {
	@Autowired
	EmployeeRepos er;
	
	public Employee save(Employee e) {
	return er.save(e);
//		return e;
	}

}
