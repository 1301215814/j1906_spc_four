package com.qf.j1906.service.Impl;

import com.qf.j1906.mapper.DeptMapper;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.pojo.DeptExample;
import com.qf.j1906.service.DeptPService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptPServiceImpl implements DeptPService {
private static final Logger logger = LogManager.getLogger(DeptPServiceImpl.class);
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findDepts() {
        logger.info("****************************************");
        DeptExample example = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(example);
        logger.info("1111111111111111111111111"+depts);
        return depts;
    }
}
