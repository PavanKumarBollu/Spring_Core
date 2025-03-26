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

		MainController controller = context.getBean("controller", MainController.class);

		Scanner scanner = new Scanner(System.in); // Create scanner once.
		boolean flag = true;

		while (flag) {
			System.out.println("Enter 1 For Searching the Employee.....:");
			System.out.println("Enter 2 For Creating  new Employee.....:");
			System.out.println("Enter 3 For Updating  the Employee.....:");
			System.out.println("Enter 4 For Deleting  the Employee.....:");
			System.out.println("Enter 5 For Exit....");
			System.out.print("your Choice : ");
			if (scanner.hasNextInt()) {
				Integer response = scanner.nextInt();
				scanner.nextLine();
				switch (response) {
				case 1:
					EmployeeVO employee = controller.getEmployee(get(scanner));
					System.out.println(employee + "\n");
					break;
				case 2:
					String addEmp = controller.saveEmployee(add(scanner));
					System.out.println(addEmp + "\n");
					break;
				case 3:
					EmployeeVO oldEmpDetails = controller.getEmployee(get(scanner));
					EmployeeVO newEmpDetails = update(oldEmpDetails, scanner);
					String updateEmp = controller.updateEmployee(newEmpDetails);
					System.out.println(updateEmp + "\n");
					break;
				case 4:
					String deleteEmp = controller.deleteEmployee(get(scanner));
					System.out.println(deleteEmp + "\n");
					break;
				case 5:
					flag = false;
					break;
				default:
					System.out.println("Please Enter Valid Input.....\n");
					break;
				}

			} else {
				System.out.println("Invalid input, please enter an Integer");
				scanner.nextLine();
			}

		}

		scanner.close();

		System.out.println("************* Container Stopped *******************\n");
		((AbstractApplicationContext) context).close();
	}

	private static EmployeeVO update(EmployeeVO oldEmpDetails, Scanner scanner) {
		String ename = "";
		String eaddress = "";
		String esalary = "";
		String choice = "";

		System.out.println("Old Details of the Employee Are Below....\n");
		System.out.println(oldEmpDetails + "\n");

		System.out.print("do You Want to Modify the name Y | N :: ");
		choice = scanner.nextLine();
		if ("y".equalsIgnoreCase(choice)) {
			System.out.print("Old eName : " + oldEmpDetails.geteName() + " new ename:: ");
			ename = scanner.nextLine();
			System.out.println();
		} else {
			ename = oldEmpDetails.geteName();
		}
		System.out.print("do You Want to Modify the eAddress Y | N :: ");
		choice = scanner.nextLine();
		if ("y".equalsIgnoreCase(choice)) {
			System.out.print("Old eaddress : " + oldEmpDetails.geteAddress() + " new eaddress:: ");
			eaddress = scanner.nextLine();
			System.out.println();
		} else {
			eaddress = oldEmpDetails.geteAddress();
		}
		System.out.print("do You Want to Modify the eSalary Y | N :: ");
		choice = scanner.nextLine();
		if ("y".equalsIgnoreCase(choice)) {

			System.out.print("Old esalary : " + oldEmpDetails.geteSalary() + " new esalary:: ");
			esalary = scanner.nextLine();
			System.out.println();
		} else {
			esalary = oldEmpDetails.geteSalary();
		}

		EmployeeVO vo = new EmployeeVO();
		vo.seteId(oldEmpDetails.geteId());
		vo.seteName(ename);
		vo.seteAddress(eaddress);
		vo.seteSalary(esalary);
		return vo;

	}

	private static Integer get(Scanner scanner) {
		System.out.print("Enter the eId:: ");
		if (scanner.hasNextInt()) {
			Integer eId = scanner.nextInt();
			scanner.nextLine();
			System.out.println();
			return eId;
		} else {
			System.out.println("Invalid input, please enter an Integer");
			scanner.nextLine();
			return 0;
		}

	}

	private static EmployeeVO add(Scanner scanner) {
		System.out.print("Enter the ename:: ");
		String ename = scanner.nextLine();
		System.out.println();

		System.out.print("Enter the eaddress:: ");
		String eaddress = scanner.nextLine();
		System.out.println();

		System.out.print("Enter the esalary:: ");
		String esalary = scanner.nextLine();
		System.out.println();

		EmployeeVO vo = new EmployeeVO();
		vo.seteName(ename);
		vo.seteAddress(eaddress);
		vo.seteSalary(esalary);
		return vo;
	}

}