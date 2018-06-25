package com.ebs.docker.bo;

import com.ebs.docker.model.*;

public class EmployeeService{

	public double calAppraisal(Employee emp){
		double appraisal;

  		if (emp.getEmpSal() < 10000)
			appraisal = 500;
		else
			appraisal = 1000;
		return appraisal;
	}

	public double calAnnualSal(Employee emp){
		double aSal;
		
		aSal = emp.getEmpSal() * 12;

		return aSal;
	}

}//end of class