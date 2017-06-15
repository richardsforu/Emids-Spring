package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("--- main started");

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean("emp", Employee.class);

		Department dept = ac.getBean("dept", Department.class);
		dept.setDeptId(11);
		dept.setDeptName("HR");

		emp.setEmpId(10);
		emp.setEmpNamne("Praveen");
		emp.setSalary(34834783);

		/*
		 * Department dept = new Department(); dept.setDeptId(1024);
		 * dept.setDeptName("HR");
		 */

		// dept1.setDeptName("Accounts");

		emp.disp();

	}

}