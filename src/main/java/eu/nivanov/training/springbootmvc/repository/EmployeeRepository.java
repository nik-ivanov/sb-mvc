package eu.nivanov.training.springbootmvc.repository;

import eu.nivanov.training.springbootmvc.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Nikolay Ivanov on 2021-11-09.
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
}
