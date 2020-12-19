package com.itgaoshu.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 1.实体类需要实现序列化接口Serializable
 * 2.属性类型改为包装类类型
 * 3.在类上使用@Table注解指定此类所对应的表
 * 4.在唯一(主键)属性上使用@Id注解指定主键
 * 5.如果表中字段名和实体类中字段名不一致需要加@Column注解
 */
@Table(name = "emp")
public class Emp implements Serializable{
    @Id
    //员工id
    private Integer empno;
    //员工名
    private String ename;
    //工资
    private Double salary;

    public Integer getEmpno() {
        return empno;
    }

    public Double getSalary() {
        return salary;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //入职时间
    private String hiredate;


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
