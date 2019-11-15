package com.qf.j1906.service.Impl;

import com.qf.j1906.mapper.EmpMapper;
import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmpPServiceImpl implements EmpPService {

    @Resource
    private EmpMapper empMapper;
    @Override
    public Emp insertEmp(Emp emp) {
        int i = empMapper.insertEmp(emp);
        if (i>0){
            return emp;
        }
        return null;
    }

    @Override
    public Boolean deleteEmp(int id) {
        int i = empMapper.deleteByPrimaryKey(id);
        if (i>0){
            return true;
        }
        return false;
    }
}
