package com.qf.j1906.service;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.Impl.EmpCServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-emp-p",fallback = EmpCServiceError.class)
public interface EmpCService {
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public Emp addEmp(@RequestBody Emp emp);

    @RequestMapping(value = "/deleteEmp",method = RequestMethod.DELETE)
    Boolean deleteEmp(int empno);

}
