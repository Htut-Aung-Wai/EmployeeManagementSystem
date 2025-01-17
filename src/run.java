import java.util.Scanner;


public class run {





    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String option="Y";

        while (!option.equals("N")) {
            EmployeeService employeeServiceVar=new EmployeeService();
            System.out.print("Enter Employee ID : ");
            String employeeID = in.nextLine();

            System.out.println("Enter your option\n1:Add\n2:Search\n3:Display\n4:Salary Update\n5:Bonus Calculate");
            int inputOption = in.nextInt();
            in.nextLine();
            switch (inputOption) {

                case 1: {
                    employeeServiceVar.EmployeeAddOption();
                    break;

                }

                case 2:{
                    System.out.println("Enter Employee ID to search : ");
                    String employeeIdSearch=in.nextLine();
                    employeeServiceVar.EmployeeSearch(employeeIdSearch);
                    break;
                }

                case 3:{

                    employeeServiceVar.AllEmployeeDisplay();
                    break;
                }
                case 4:{
                    System.out.println("Enter Update Salary");
                    double salary=in.nextDouble();
                    in.nextLine();
                    employeeServiceVar.EmployeeSalaryUpdate(employeeID,salary);
                    break;
                }
                case 5:{
                    System.out.println("Enter bonus percent");
                    int bonusPercent=in.nextInt();
                    in.nextLine();
                    employeeServiceVar.CalculateSalaryPercent(employeeID,bonusPercent);
                    break;
                }


                default:
                    throw new IllegalStateException("Unexpected value: " + inputOption);
            }




            System.out.println("Do you want to continue (Y or N)");

            option=in.nextLine();

        }





    }
}
