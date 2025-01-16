
public class Employee {
    private String id;
    private String name;
    private double salary;


    public Employee(String id,String name,double salary) {

            this.id=id;
            this.name=name;
            this.salary=salary;
    }

    public void setID(String idinput) {
        this.id = idinput;

    }

    public String getID() {
        return id;

    }

    public String getName()
    {

        return name;
    }

    public double getSalary()
    {

        return salary;
    }

    public void UpdateSalary(double update_salary)
    {

        this.salary=update_salary;
    }

    public double CalculateBonus(double percent)
    {

        return this.salary*percent/100;
    }


;

}