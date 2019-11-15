package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptPService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptPController {
private static final Logger logger = LogManager.getLogger(DeptPController.class);
    //@Autowired  //按类型搜索bean对象；如果需要按名称搜索，需要借助@Qualified注解
    /*@Qualifier(value = "deptPService")*/
    @Autowired
    private DeptPService deptPService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findAll(){
        logger.info("sssssssssssssssssssssssssssssssssss");
        List<Dept> depts = deptPService.findDepts();
        logger.info(depts+"------------------------------------------");
        return depts;
    }

}
