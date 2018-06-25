package com.praveen;

import org.junit.runner.*;
import org.junit.runner.notification.*;


public class EmpSuiteRunner{

	public static final void main(String[] args){
	Result result = JUnitCore.runClasses(EmpSuite.class);

for(Failure failure : result.getFailures()){
	System.out.println(failure.toString());
}//end of for

	System.out.println(result.wasSuccessful());
	}//end of main

}//end of class
