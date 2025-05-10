import java.util.Scanner;

// Define interface for all employees
interface EmployeeInterface {
    String getEmployeeId();
    String getName();
    void displayBasicInfo();
    double calculateMonthlySalary();
    void displayDetails();
}

// Parent class for all types of employees
abstract class Employee implements EmployeeInterface {

    // Properties all employees have
    protected String employeeId;
    protected String name;
    protected double baseSalary;

    // Constructor - runs when we create a new employee
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Simple getters to access employee information
    @Override
    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getName() {
        return name;
    }

    // Display basic employee information
    @Override
    public void displayBasicInfo() {
        System.out.println("ID: " + employeeId + ", Name: " + name);
    }

    // Every employee needs to have a way to calculate salary, but it's different for each type
    @Override
    public abstract double calculateMonthlySalary();

    // Display all details about an employee
    @Override
    public void displayDetails() {
        displayBasicInfo();
        System.out.printf("Monthly Salary: $%.2f\n", calculateMonthlySalary());
    }
}

// Full-time employees get a yearly salary plus bonus
class FullTimeEmployee extends Employee {

    private double annualBonus;

    // Constructor for full-time employees
    public FullTimeEmployee(
        String employeeId,
        String name,
        double baseSalary,
        double annualBonus
    ) {
        super(employeeId, name, baseSalary); // Call the parent constructor
        this.annualBonus = annualBonus;
    }

    // Calculate monthly salary for full-time employees
    @Override
    public double calculateMonthlySalary() {
        // Monthly salary = yearly salary divided by 12 + bonus divided by 12
        return (baseSalary / 12.0) + (annualBonus / 12.0);
    }

    // Show full-time employee details
    @Override
    public void displayBasicInfo() {
        System.out.print("Type: Full-Time, ");
        System.out.print("ID: " + employeeId + ", Name: " + name);
        System.out.printf(
            ", Base Annual Salary: $%.2f, Annual Bonus: $%.2f\n",
            baseSalary,
            annualBonus
        );
    }

    // Display all details including salary
    @Override
    public void displayDetails() {
        displayBasicInfo();
        System.out.printf(
            "--> Calculated Monthly Salary: $%.2f\n",
            calculateMonthlySalary()
        );
        System.out.println("-------------------------------------");
    }
}

// Part-time employees get paid by the hour
class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    // Constructor for part-time employees
    public PartTimeEmployee(
        String employeeId,
        String name,
        double hourlyRate,
        int hoursWorked
    ) {
        super(employeeId, name, 0); // Part-time employees don't have a base salary
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate monthly salary for part-time employees
    @Override
    public double calculateMonthlySalary() {
        // Simply multiply hours worked by hourly rate
        return hourlyRate * hoursWorked;
    }

    // Show part-time employee details
    @Override
    public void displayBasicInfo() {
        System.out.print("Type: Part-Time, ");
        System.out.print("ID: " + employeeId + ", Name: " + name);
        System.out.printf(
            ", Hourly Rate: $%.2f, Hours Worked: %d\n",
            hourlyRate,
            hoursWorked
        );
    }

    // Display all details including salary
    @Override
    public void displayDetails() {
        displayBasicInfo();
        System.out.printf(
            "--> Calculated Monthly Salary: $%.2f\n",
            calculateMonthlySalary()
        );
        System.out.println("-------------------------------------");
    }
}

// Main system that manages all employees
public class EmployeeManagementSystem {

    private static final int MAX_EMPLOYEES = 5; // We can store up to 5 employees
    private Employee[] employees; // Array to store employees
    private int employeeCount; // How many employees we currently have
    private Scanner scanner; // To read user input

    // Constructor - sets up the system
    public EmployeeManagementSystem() {
        employees = new Employee[MAX_EMPLOYEES];
        employeeCount = 0;
        scanner = new Scanner(System.in);
    }

    // Start the program
    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    addFullTimeEmployee();
                    break;
                case 2:
                    addPartTimeEmployee();
                    break;
                case 3:
                    viewAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Add a blank line for readability
        } while (choice != 4);

        scanner.close(); // Close scanner when done
    }

    // Show the main menu
    private void displayMenu() {
        System.out.println("===== Employee Management System =====");
        System.out.println("1. Add Full-Time Employee");
        System.out.println("2. Add Part-Time Employee");
        System.out.println("3. View All Employees");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Get user's menu choice
    private int getUserChoice() {
        int choice = -1;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            // If user enters text instead of a number
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine(); // Clear the input buffer
        }
        return choice;
    }

    // Add a new full-time employee
    private void addFullTimeEmployee() {
        // Check if we have room for more employees
        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println(
                "Error: Maximum number of employees reached (" +
                MAX_EMPLOYEES +
                "). Cannot add more."
            );
            return;
        }

        try {
            System.out.println("\n--- Add Full-Time Employee ---");
            System.out.print("Enter Employee ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Base Annual Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Annual Bonus: ");
            double bonus = Double.parseDouble(scanner.nextLine());

            // Create the new employee and add to our array
            employees[employeeCount] = new FullTimeEmployee(
                id,
                name,
                salary,
                bonus
            );
            employeeCount++;
            System.out.println("Full-Time Employee added successfully.");
        } catch (NumberFormatException e) {
            // If user enters text for salary or bonus
            System.out.println(
                "Invalid numerical input. Please enter numbers for salary and bonus. Employee not added."
            );
        } catch (Exception e) {
            System.out.println(
                "An unexpected error occurred: " +
                e.getMessage() +
                ". Employee not added."
            );
        }
    }

    // Add a new part-time employee
    private void addPartTimeEmployee() {
        // Check if we have room for more employees
        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println(
                "Error: Maximum number of employees reached (" +
                MAX_EMPLOYEES +
                "). Cannot add more."
            );
            return;
        }

        try {
            System.out.println("\n--- Add Part-Time Employee ---");
            System.out.print("Enter Employee ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Hourly Rate: ");
            double rate = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Hours Worked This Month: ");
            int hours = Integer.parseInt(scanner.nextLine());

            // Basic check for negative values
            if (rate < 0 || hours < 0) {
                System.out.println(
                    "Hourly rate and hours worked cannot be negative. Employee not added."
                );
                return;
            }

            // Create the new employee and add to our array
            employees[employeeCount] = new PartTimeEmployee(
                id,
                name,
                rate,
                hours
            );
            employeeCount++;
            System.out.println("Part-Time Employee added successfully.");
        } catch (NumberFormatException e) {
            // If user enters text for rate or hours
            System.out.println(
                "Invalid numerical input. Please enter numbers for rate and hours. Employee not added."
            );
        } catch (Exception e) {
            System.out.println(
                "An unexpected error occurred: " +
                e.getMessage() +
                ". Employee not added."
            );
        }
    }

    // Show all employees in the system
    private void viewAllEmployees() {
        System.out.println("\n--- All Employee Details ---");
        if (employeeCount == 0) {
            System.out.println("No employees have been added yet.");
            return;
        }

        // Loop through all employees and show their details
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee #" + (i + 1));
            employees[i].displayDetails(); // This calls the right method based on employee type
        }
    }

    // Start the program
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.run();
    }
}
