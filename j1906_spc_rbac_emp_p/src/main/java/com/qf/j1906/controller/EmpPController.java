package com.qf.j1906.controller;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpPController {
    @Autowired
    private EmpPService empPService;

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public Emp addEmp(@RequestBody Emp emp){
        Emp emp1 = empPService.insertEmp(emp);
        return emp1;
    }

    @RequestMapping(value = "/deleteEmp/{id}",method = RequestMethod.DELETE)
    public Boolean deleteEmpById(@PathVariable("id") int id){
        Boolean aBoolean = empPService.deleteEmp(id);
        return aBoolean;
    }
}
