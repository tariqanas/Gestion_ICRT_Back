package com.ges.interco.restControllers;

import com.ges.interco.Services.functional.IEmployee;
import com.ges.interco.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collection;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/meteo")
public class MeteoController implements Serializable {

    @Autowired
    IEmployee employee;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Collection<Employee> getEmployeesData() {
        return employee.findAll();
    }
}
