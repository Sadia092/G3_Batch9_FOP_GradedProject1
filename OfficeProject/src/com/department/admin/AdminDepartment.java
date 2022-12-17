package com.department.admin;

import com.department.superclass.*;

public class AdminDepartment extends SuperDepartment

{
		
		//This is the Administration Department
		
		public String departmentName()
		{
			return ("Admin Department");
		}
		public String getTodaysWork()
		{
			return ("\n Complete your documents Submission");
		}
		public String getWorkDeadline()
		{
			return ("\n Complete by EOD");
			}
		
	}



