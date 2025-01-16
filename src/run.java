import java.util.Scanner;


public class run {





    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String option="Y";

        while (!option.equals("N")) {
            EmployeeService ES=new EmployeeService();
            System.out.print("Enter Employee ID");
            String employeeID = in.nextLine();

            System.out.println("Enter your option\n1:Add\n2:Search\n3:Display\n4:Salary Update\n5:Bonus Calculate1");
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
