package eu.nivanov.training.springbootmvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Nikolay Ivanov on 2021-11-09.
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private final Long id;

    private String name;

    private CompanyPosition position;

    private Employee() { // Required by Hibernate
        this.id = null;
    }

}
