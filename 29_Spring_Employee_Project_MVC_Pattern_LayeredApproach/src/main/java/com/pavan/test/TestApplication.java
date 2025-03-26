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
            System.out.println("Enter 3 For Exit....");
            System.out.print("your Choice : ");
            if (scanner.hasNextInt()){
                Integer response = scanner.nextInt();
                scanner.nextLine(); 
                switch (response) {
                    case 1:
                        EmployeeVO employee = controller.getEmployee(get(scanner));
                        System.out.println(employee + "\n");
                        break;
                    case 2:
                        String result = controller.saveEmployee(add(scanner));
                        System.out.println(result + "\n");
                        break;
                    case 3:
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

    private static Integer get(Scanner scanner) { 
        System.out.print("Enter the eId:: ");
        if (scanner.hasNextInt()){
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