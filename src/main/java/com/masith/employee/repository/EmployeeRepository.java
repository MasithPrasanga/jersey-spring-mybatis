package com.masith.employee.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.masith.employee.model.Employee;

public interface EmployeeRepository {
	
	@Select("select * from employee")
	@Results(value = {
			  @Result(property = "id", column = "id"),
			  @Result(property = "firstName", column = "first_name"),
			  @Result(property = "lastName", column = "last_name"),
			  @Result(property = "salary", column = "salary")
			})
	public List<Employee> readAll();
	
	
	@Select("select * from employee where id = #{id}")
	@Results(value = {
			  @Result(property = "id", column = "id"),
			  @Result(property = "firstName", column = "first_name"),
			  @Result(property = "lastName", column = "last_name"),
			  @Result(property = "salary", column = "salary")
			})
	public Employee read(int id);
	
	
	@Insert("insert into employee (first_name, last_name, salary) values ( #{firstName}, #{lastName}, #{salary} )")
	public void insert(Employee employee);
	
	@Update("update employee set first_name = #{firstName}, last_name = #{lastName}, salary = #{salary} WHERE id = #{id}")
	public void update(Employee employee);
	
	@Delete("delete from employee where id = #{id}")
	public void delete(Employee employee);

}


