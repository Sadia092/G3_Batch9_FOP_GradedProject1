package com.department.tech;

import com.department.superclass.*;

public class TechDepartment extends SuperDepartment{
	
	// This is the Technical Department 
	

	public String departmentName()
	{
		return ("Tech Department");
	}
	public String getTodaysWork()
	{
		return ("\n Complete coding of Module 1");
	}
	public String getWorkDeadline()
	{
		return ("\n Complete by EOD");
		}
	public String getTechStackInformation()
	{
		return ("\n Core Java");
	}

}
