package com.ebs.docker;

import org.junit.runner.*;
import org.junit.runners.*;

import com.ebs.docker.bo.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestEmployeeService.class, TestEmployeeService1.class})

public class EmpSuite{
}