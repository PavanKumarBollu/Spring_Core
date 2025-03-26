package com.pavan.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pavan.config.AppConfig;
import com.pavan.controller.MainController;
import com.pavan.vo.EmployeeVO;

public class TestApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("************* Container Started *******************\n");
		
		MainController controller = context.getBean("controller",MainController.class);
		
		boolean falg = true;
		while(falg)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter 1 For Searching the Employee.....:");
			System.out.print("Enter 2 For Creating  new Employee.....:");
			System.out.print("Enter 3 For Exit....\n");
			Integer response = scanner.nextInt();
			switch(response)
			{
			case 1:
				EmployeeVO employee = controller.getEmployee(get());
				System.out.println(employee);
				break;
			case 2:
				String result = controller.saveEmployee(add());
				System.out.println(result+"\n");
				break;
			case 3:
				falg=false;
				break;
			default:
				System.out.println("Please Enter Valid Input.....\n");
				break;
			}
//			scanner.close();
			
		}
		
		
		
		
		System.out.println("************* Container Stopped *******************\n");
		((AbstractApplicationContext) context).close();
	}
	
	
	private static Integer get()
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the eId:: ");
		Integer eId = scanner.nextInt();
		System.out.println();
		scanner.close();
		return eId;
	}
	

	private static EmployeeVO  add() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter the ename:: ");
		String ename = scanner.next();
		System.out.println();
		
		System.out.print("Enter the eaddress:: ");
		String eaddress = scanner.next();
		System.out.println();
		
		System.out.print("Enter the esalary:: ");
		String esalary = scanner.next();
		System.out.println();
		EmployeeVO vo = new EmployeeVO();
		vo.seteName(ename);
		vo.seteAddress(eaddress);
		vo.seteSalary(esalary);
		scanner.close();
		return vo;
	}
	
}
