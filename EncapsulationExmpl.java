public class EncapsulationExmpl {

    private int employee_id;
    private String employee_name; // Private instance variables
    private double employee_salary;

    public EncapsulationExmpl(int id, String name, double salary) { // Constructor
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    public int getEmployeeId() { // Getter method for employee_id
        return employee_id;
    }

    public void setEmployeeId(int id) { // Setter method for employee_id
        this.employee_id = id;
    }

    public String getEmployeeName() { // Getter method for employee_name
        return employee_name;
    }

    public void setEmployeeName(String name) { // Setter method for employee_name
        this.employee_name = name;
    }

    public double getEmployeeSalary() { // Getter method for employee_salary
        return employee_salary;
    }

    public void setEmployeeSalary(double salary) { // Setter method for employee_salary
        this.employee_salary = salary;
    }

    public void displayEmployeeDetails() { // Method to display employee details
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Employee Salary: " + employee_salary + " INR");
    }

    public static void main(String[] args) {
        // Creating an Employee object
        EncapsulationExmpl employee = new EncapsulationExmpl(101, "Sunny Surve", 50000.0);

        System.out.println("Employee Details:"); // Displaying employee details
        employee.displayEmployeeDetails();

        employee.setEmployeeId(102); // Modifying employee details using setter methods
        employee.setEmployeeName("Pratham Surve");
        employee.setEmployeeSalary(60000.0);

        System.out.println("\nUpdated Employee Details:"); // Displaying updated employee details
        employee.displayEmployeeDetails();
    }
}
