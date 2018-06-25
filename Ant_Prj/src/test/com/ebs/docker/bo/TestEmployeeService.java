package com.ebs.docker.bo;

import org.junit.*;
import static org.junit.Assert.*;

import com.ebs.docker.model.*;
import com.ebs.docker.bo.*;

public class TestEmployeeService{
	
private Employee emp;
private EmployeeService empSer;

@Before
public void setup(){
	emp = new Employee();
	emp.setEmpId(1);
	emp.setEmpName("Balagowni");
	emp.setEmpSal(20000);

	empSer = new EmployeeService();
}

@Test
public void testCalAppraisal(){
	double actual = empSer.calAppraisal(emp);

assertTrue("This will succeed", 1000 == actual);

}

@Test
public void testCalAnnualSal(){

assertTrue("This is correct", 240000 == empSer.calAnnualSal(emp));
}

}//end of class