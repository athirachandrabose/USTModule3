package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Employee;
@Repository
public interface EmployeeRepos extends JpaRepository<Employee,Long> {

}
