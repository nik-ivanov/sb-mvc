package eu.nivanov.training.springbootmvc.service;

import eu.nivanov.training.springbootmvc.model.Employee;
import eu.nivanov.training.springbootmvc.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nikolay Ivanov on 2021-11-09.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository
                .findById(id)
                .orElseThrow();
    }

    public Employee save(Employee employee) {
        employee = employeeRepository.save(employee);
        return findById(employee.getId()); // Useless operation, Just to be compatible with the WebFlux implementation
    }

    public Employee promote(long employeeId) {
        Employee employee = findById(employeeId);
        employee.setPosition(employee.getPosition().getHigherPosition());
        return employeeRepository.save(employee);
    }
}
