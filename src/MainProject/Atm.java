package day2;
import java.util.Scanner;
import java.util.ArrayList;
 

public class Atm {
	  Scanner sc = new Scanner(System.in);
	  
	    
	    ArrayList<Employee> employees = new ArrayList<>();
	 
	    
	    static class Employee {
	        String name;
	        int age;
	        String designation;
	        double salary;
	 
	        Employee(String name, int age, String designation, double salary) {
	            this.name = name;
	            this.age = age;
	            this.designation = designation;
	            this.salary = salary;
	        }
	    }
	 
	    public static void main(String[] args) {
	    	Atm obj = new Atm();
	        int choice;
	 
	        do {
	            System.out.println("\n----- MENU -----");
	            System.out.println("1) Create");
	            System.out.println("2) Display");
	            System.out.println("3) Raise Salary");
	            System.out.println("4) Exit");
	            System.out.print("Enter your choice: ");
	            choice = obj.sc.nextInt();
	 
	            switch (choice) {
	                case 1:
	                    obj.create();
	                    break;
	                case 2:
	                    obj.display();
	                    break;
	                case 3:
	                    obj.raiseSalary();
	                    break;
	                case 4:
	                    System.out.println("Exiting program... Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter 1-4.");
	            }
	        } while (choice != 4);
	    }
	 
	    void create() {
	        boolean addMore = true;
	 
	        while (addMore) {
	            sc.nextLine();
	            System.out.print("Enter the name: ");
	            String name = sc.nextLine();
	 
	            int age;
	            do {
	                System.out.print("Enter the age (must be above 18): ");
	                age = sc.nextInt();
	                if (age <= 18) {
	                    System.out.println("Invalid age! Age must be above 18.");
	                }
	            } while (age <= 18);
	 
	            sc.nextLine();
	            System.out.print("Enter the designation (P - Programmer, T - Tester, M - Manager): ");
	            String code = sc.nextLine().toUpperCase();
	 
	            String designation;
	            double salary;
	 
	            switch (code) {
	                case "P":
	                    designation = "Programmer";
	                    salary = 35000;
	                    break;
	                case "T":
	                    designation = "Tester";
	                    salary = 25000;
	                    break;
	                case "M":
	                    designation = "Manager";
	                    salary = 50000;
	                    break;
	                default:
	                    designation = "Not Specified";
	                    salary = 0;
	            }
	 
	           
	            employees.add(new Employee(name, age, designation, salary));
	 
	            System.out.println("Employee created successfully! Base salary set to " + salary);
	 
	            
	            String response;
	            while (true) {
	                System.out.print("Do you want to add another employee? (Y/N): ");
	                response = sc.nextLine().trim().toUpperCase();
	                if (response.equals("Y") || response.equals("N")) {
	                    break;
	                }
	                System.out.println("Invalid input! Please enter Y or N.");
	            }
	 
	            addMore = response.equals("Y");
	        }
	    }
	 
	    void display() {
	        if (employees.isEmpty()) {
	            System.out.println("No employee records found. Please create one first.");
	            return;
	        }
	 
	        System.out.println("\n--- Employee Details ---");
	        for (int i = 0; i < employees.size(); i++) {
	            Employee e = employees.get(i);
	            System.out.println("\nEmployee #" + (i + 1));
	            System.out.println("Name: " + e.name);
	            System.out.println("Age: " + e.age);
	            System.out.println("Designation: " + e.designation);
	            System.out.println("Salary: " + e.salary);
	        }
	    }
	 
	    void raiseSalary() {
	        if (employees.isEmpty()) {
	            System.out.println("No employee records found. Please create one first.");
	            return;
	        }
	 
	        sc.nextLine();
	        System.out.print("Enter the name of the employee to raise salary for: ");
	        String searchName = sc.nextLine();
	 
	        
	        Employee target = null;
	        for (Employee e : employees) {
	            if (e.name.equalsIgnoreCase(searchName)) {
	                target = e;
	                break;
	            }
	        }
	 
	        if (target == null) {
	            System.out.println("No employee found with the name: " + searchName);
	            return;
	        }
	 
	       
	        double percent;
	        do {
	            System.out.print("Enter the raise percentage (must be between 1 and 10): ");
	            percent = sc.nextDouble();
	            if (percent < 1 || percent > 10) {
	                System.out.println("Invalid percentage! It must be between 1 and 10.");
	            }
	        } while (percent < 1 || percent > 10);
	 
	        double increment = target.salary * (percent / 100);
	        target.salary = target.salary + increment;
	 
	        System.out.println("Salary raised successfully for " + target.name + "!");
	        System.out.println("New Salary: " + target.salary);

    
    }

}
