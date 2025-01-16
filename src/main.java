import java.util.ArrayList;
import java.util.Scanner;


public class main {

    /*static ArrayList<Employee> EmployeeID = new ArrayList<>();

    public static void addEmployee(String id,String name,Double salary)
    {
        Employee add=new Employee(id,name,salary);
        EmployeeID.add(add);

    }

    public static void EmployeeAddOption()
    {

        String option="N";
        Scanner in =new Scanner(System.in);





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
            if (option.equals("Y"))
            {
                EmployeeAddOption();
            }
            else {
                return;
            }


        in.close();
    } */

    /*public static void employeeSearch(String Employee)
    {

        for(Employee list: EmployeeID) {

            if (Employee.equals(list.getID())) {
                System.out.println("Employee Exists ! We found it !!");
                System.out.println("ID : "+list.getID()+" name : "+list.getName()+" Salary : "+list.getSalary());
            }

        }

    }

    public static void AllemployeeDisplay()
    {
        for (Employee list : EmployeeID)
        {
            System.out.println("All Employee Display");
            System.out.println("ID : " + list.getID() + " name : " + list.getName() + " Salary : " + list.getSalary());


        }
    }*/



    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String option="Y";

        while (!option.equals("N")) {
            EmployeeService ES=new EmployeeService();
            System.out.print("Enter Employee ID");
            String employeeID = in.nextLine();

            System.out.println("Enter your option");
            int inputoption = in.nextInt();
            switch (inputoption) {

                case 1: {
                    ES.EmployeeAddOption();
                    break;

                }

                case 2:{

                    ES.employeeSearch(employeeID);
                    break;
                }

                case 3:{

                    ES.AllemployeeDisplay();
                    break;
                }
                case 4:{
                    System.out.println("Enter Update Salary");
                    double salary=in.nextDouble();
                    ES.employeeSalaryUpdate(employeeID,salary);
                    break;
                }
                case 5:{
                    System.out.println("Enter bonus percent");
                    int bonuspercent=in.nextInt();
                    ES.calculateSalaryPercent(employeeID,bonuspercent);
                    break;
                }


                default:
                    throw new IllegalStateException("Unexpected value: " + inputoption);
            }




            System.out.println("Do you want to continue (Y or N)");
            in.nextLine();
            option=in.nextLine();
        }





    }
}
