package com.itgaoshu.dao;

import com.itgaoshu.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 继承tk.mybatis.mapper.common.Mapper<T>接口
 *
 */
//@Mapper
@Repository
public interface EmpMapper extends tk.mybatis.mapper.common.Mapper<Emp>{

    /*@Select("select * from emp")
    public List<Emp> selectEmp();*/
}
