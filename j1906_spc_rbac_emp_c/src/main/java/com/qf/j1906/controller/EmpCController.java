package com.qf.j1906.controller;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpCController {
    @Autowired
    private EmpCService empCService;

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    @ResponseBody
    public Emp addEmp(Emp emp){
        Emp emp1 = empCService.addEmp(emp);
        return emp1;
    }

    @RequestMapping(value = "/deleteEmp",method = RequestMethod.DELETE)
    public String deleteEmp(@RequestParam("empno") int empno){
        Boolean aBoolean = empCService.deleteEmp(empno);
        return "success";
    }

}
