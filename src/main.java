import java.util.ArrayList;
import java.util.Scanner;


public class main {

    static ArrayList<Employee> EmployeeID = new ArrayList<>();

    public static void addEmployee(String id,String name,Double salary)
    {
        Employee add=new Employee(id,name,salary);
        EmployeeID.add(add);

    }

    public static void EmployeeAddOption()
    {

        String option="Y";
        Scanner in =new Scanner(System.in);

        while (!option.equals("N")) {


            System.out.println("Enter Employee ID");
            String id = in.nextLine();

            System.out.println("Enter Employee Name");
            String name = in.nextLine();

            System.out.println("Enter Employee Salary");
            Double salary = in.nextDouble();
            addEmployee(id, name, salary);
            in.nextLine();
            System.out.println("Do you want to add more (Y or N)");
            option=in.nextLine();
        }

        in.close();
    }

    public void employeeSearch(String Employee)
    {

        for(Employee list: EmployeeID) {

            if (Employee.equals(list.getID())) {
                System.out.println("Employee Exists");
                System.out.println("ID : "+list.getID()+" name : "+list.getName()+" Salary : "+list.getSalary());
            }

        }

    }


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Employee ID");
        String employeeID=in.nextLine();

        System.out.println("Enter your option");
        int inputoption= in.nextInt();
        switch(inputoption){

            case 1: {EmployeeAddOption();}

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + inputoption);
        }




        for(Employee list:EmployeeID) {
              System.out.println("ID : "+list.getID()+" name : "+list.getName()+" Salary : "+list.getSalary());


        }





    }
}
