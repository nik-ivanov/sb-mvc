package eu.nivanov.training.springbootmvc.controller;

import eu.nivanov.training.springbootmvc.model.Employee;
import eu.nivanov.training.springbootmvc.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Nikolay Ivanov on 2021-11-09.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> fetchAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping
    public Employee createNew(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee fetchOneById(@PathVariable("id") long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/{id}/promote")
    public Employee promote(@PathVariable("id") long id) {
        return employeeService.promote(id);
    }
}
