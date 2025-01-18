import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {


    static ArrayList<Employee> employeeList = new ArrayList<>();

    public void AddEmployee(String id, String name, Double salary) {
        Employee add = new Employee(id, name, salary);
        employeeList.add(add);

    }

    public void EmployeeAddOption() {

        String option = "N";
        Scanner in = new Scanner(System.in);



        System.out.println("Enter Employee ID");
        String id = in.nextLine();

        for (Employee list : employeeList) {
            if(list.getID().equals(id))
            {
                System.out.println("Employee Id Exists ,You should try another ID ;");
                EmployeeAddOption();
            }




        }

        System.out.println("Enter Employee Name");
        String name = in.nextLine();

        System.out.println("Enter Employee Salary");
        Double salary = in.nextDouble();
        in.nextLine();
        AddEmployee(id, name, salary);

        System.out.println("Do you want to add more (Y or N)");
        option = in.nextLine();
        if (option.equals("Y")) {
            EmployeeAddOption();
        } else {
            return;
        }


        //in.close();
    }

    public void EmployeeSearch(String Employee) {

        for (Employee list : employeeList) {

            if (list.getID().equals(Employee)) {
                System.out.println("Employee Exists ! We found it !!");
                System.out.println("ID : " + list.getID() + " name : " + list.getName() + " Salary : " + list.getSalary());
                return;
            }

        }
        System.out.println("Employee not Found !!");

    }

    public void AllEmployeeDisplay() {
        System.out.println("All Employee Display");
        for (Employee list : employeeList) {
            if(list.getID() == null && list.getID().isEmpty())
            {System.out.println("There is no Employee in database\n");}
            else
            {System.out.println("ID : " + list.getID() + " name : " + list.getName() + " Salary : " + list.getSalary()+"\n");}



        }
        System.out.println("Employee not Found !!");
    }

    public void EmployeeSalaryUpdate(String employeeId, double salary) {
        for (Employee list : employeeList) {

            if (employeeId.equals(list.getID())) {
                list.UpdateSalary(salary);
                System.out.println(list.getName() + " 's Salary Updated to " + salary);
                return;
            }


        }
        System.out.println("Employee not Found !!");

    }

    public void CalculateSalaryPercent(String id, int percent) {

        for (Employee list : employeeList) {

            if (id.equals(list.getID())) {
                double bonus = list.getSalary()*percent/100;
                System.out.println(list.getName() + " 's Bonus is " + bonus);
                return;
            }

        }

        System.out.println("Employee not found or Input is wrong");


    }



}