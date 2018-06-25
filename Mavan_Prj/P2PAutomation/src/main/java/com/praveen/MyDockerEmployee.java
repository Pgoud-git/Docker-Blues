package com.praveen;

public class MyDockerEmployee{

private int empId;
private String empName;

public MyDockerEmployee(int pEmpId, String pEmpName){
	empId = pEmpId;
	empName = pEmpName;
}

public int getEmpId(){
	return empId;
}

public void setEmpId(int pEmpId){
	empId = pEmpId;
}

public String getEmpName(){
	return empName;
}

public void setEmpName(String pEmpName){
	empName = pEmpName;
}

public static final void main(String[] args){

	MyDockerEmployee emp = new MyDockerEmployee(1,"Praveen");
	System.out.println("My Docker Employee Id = "+emp.getEmpId());
	System.out.println("My Docker Employee Name = "+emp.getEmpName());
}//end of main
}//end of class