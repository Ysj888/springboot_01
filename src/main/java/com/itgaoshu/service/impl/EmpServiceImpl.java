package com.itgaoshu.service.impl;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.dao.EmpMapper;
import com.itgaoshu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpMapper empMapper;
    @Cacheable("selectEmp")
    public List<Emp> selectEmp() {
        System.out.println("第一次查询");
        return empMapper.selectAll();
    }
}
