package com.qf.j1906.service.Impl;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

//当feign调用失败时执行此实现

@Component
public class EmpCServiceError implements EmpCService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Emp addEmp(Emp emp) {
        emp.setEmpno(-1);
        return emp;
    }

    @Override
    public Boolean deleteEmp(int id) {
        try {
            restTemplate.delete("http://service-emp-p/deleteEmp/{1}",id);
            return true;
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
