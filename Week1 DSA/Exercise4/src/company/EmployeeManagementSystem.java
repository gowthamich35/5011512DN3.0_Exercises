package company;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot add more employees.");
            return;
        }
        employees[size++] = employee;
        System.out.println("Employee " + employee.getName() + " added.");
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--size] = null;
        System.out.println("Employee with ID " + employeeId + " deleted.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 60000));
        ems.addEmployee(new Employee(2, "Bob", "Manager", 80000));
        ems.addEmployee(new Employee(3, "Charlie", "Analyst", 50000));
        System.out.println();
        // Searching an employee
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println("Found: " + emp);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println();
        // Traversing employees
        System.out.println("All employees:");
        ems.traverseEmployees();
        System.out.println();
        // Deleting an employee
        ems.deleteEmployee(2);
        System.out.println();
        // Traversing employees again
        System.out.println("All employees after deletion:");
        ems.traverseEmployees();
    }
}
