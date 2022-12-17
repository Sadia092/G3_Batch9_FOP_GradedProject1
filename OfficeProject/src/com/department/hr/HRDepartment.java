package com.department.hr;

import com.department.superclass.*;

public class HRDepartment extends SuperDepartment{

	//This is the HR Department
	

		public String departmentName()
		{
			return ("HR Department");
		}
		public String getTodaysWork()
		{
			return ("\n Fill today's timesheet and mark your attendance");
		}
		public String getWorkDeadline()
		{
			return ("\n Complete by EOD");
			}
		public String doActivity()
		{
			return ("\n Team Lunch");
		}

}
