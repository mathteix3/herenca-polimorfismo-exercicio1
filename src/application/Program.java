package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("\nEmployee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            String outsourced = scanner.next();
            scanner.nextLine(); // Clear the buffer
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if(outsourced.charAt(0) == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name,hours,valuePerHour));
            }

        }

        System.out.println("\nPAYMENTS:");
        for(Employee employee : employees){
            System.out.println(employee);
        }

        scanner.close();
    }
}
