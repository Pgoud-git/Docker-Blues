package com.praveen.model;

public class Employee{

private int empId;
private String empName;

private double empSal;

public Employee(){
	empId = 0;
	empName = "Guest";
	empSal = 0.0;
}

public Employee(int pEmpId, String pEmpName){
	empId = pEmpId;
	empName = pEmpName;
	empSal = 10000;
}

public Employee(int pEmpId, String pEmpName,double pEmpSal){
	empId = pEmpId;
	empName = pEmpName;
	empSal = pEmpSal;
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

public double getEmpSal(){
	return empSal;
}

public void setEmpSal(double pEmpSal){
	empSal = pEmpSal;
}

}//end of class