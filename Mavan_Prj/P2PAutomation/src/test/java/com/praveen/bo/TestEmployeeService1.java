package com.praveen.bo;

import org.junit.*;
import static org.junit.Assert.*;

import com.praveen.model.*;
import com.praveen.bo.*;

public class TestEmployeeService1{
	
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

assertTrue("This will succeed1", 1000 == actual);

}

@Test
public void testCalAnnualSal(){

assertTrue("This is correct1", 240000 == empSer.calAnnualSal(emp));
}

}//end of class