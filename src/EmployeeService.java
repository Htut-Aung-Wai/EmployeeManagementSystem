import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {


    static ArrayList<Employee> EmployeeID = new ArrayList<>();

    public void addEmployee(String id, String name, Double salary) {
        Employee add = new Employee(id, name, salary);
        EmployeeID.add(add);

    }

    public void EmployeeAddOption() {

        String option = "N";
        Scanner in = new Scanner(System.in);


        System.out.println("Enter Employee ID");
        String id = in.nextLine();

        System.out.println("Enter Employee Name");
        String name = in.nextLine();

        System.out.println("Enter Employee Salary");
        Double salary = in.nextDouble();
        addEmployee(id, name, salary);
        in.nextLine();
        System.out.println("Do you want to add more (Y or N)");
        option = in.nextLine();
        if (option.equals("Y")) {
            EmployeeAddOption();
        } else {
            return;
        }


        in.close();
    }

    public void employeeSearch(String Employee) {

        for (Employee list : EmployeeID) {

            if (Employee.equals(list.getID())) {
                System.out.println("Employee Exists ! We found it !!");
                System.out.println("ID : " + list.getID() + " name : " + list.getName() + " Salary : " + list.getSalary());
            } else {
                System.out.println("Employee not Found !!");
            }


        }

    }

    public void AllemployeeDisplay() {
        for (Employee list : EmployeeID) {
            System.out.println("All Employee Display");
            System.out.println("ID : " + list.getID() + " name : " + list.getName() + " Salary : " + list.getSalary());


        }
    }

    public void employeeSalaryUpdate(String employeeid, double salary) {
        for (Employee list : EmployeeID) {

            if (employeeid.equals(list.getID())) {
                list.UpdateSalary(salary);
                System.out.println(list.getName() + " 's Salary Updated to " + salary);
            } else {

                System.out.println("Employee not found !!");

            }


        }

    }

    public void calculateSalaryPercent(String id, int percent) {

        for (Employee list : EmployeeID) {

            if (id.equals(list.getID())) {
                double bonus = list.CalculateBonus(percent);
                System.out.println(list.getName() + " 's Bonus is " + bonus);
            }
            else{
                System.out.println("Employee not found or Input is wrong");
            }

        }


    }

}