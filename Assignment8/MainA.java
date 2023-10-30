class Employee 
{
    int EID;
    String Name;
    double Basic;
    String City;

    public Employee(int EID, String Name, double Basic, String City) 
    {
        this.EID = EID;
        this.Name = Name;
        this.Basic = Basic;
        this.City = City;
    }

    public void showDetails() 
    {
        System.out.println("Employee ID: " + EID);
        System.out.println("Name: " + Name);
        System.out.println("Basic Pay: " + Basic);
        System.out.println("City: " + City);
    }

    public double calculateGrossSalary()
    {
        return 0; 
    }
}

class Company1 extends Employee 
{
    public Company1(int EID, String Name, double Basic, String City) 
    {
        super(EID, Name, Basic, City);
    }

    @Override
    public double calculateGrossSalary() 
    {
        double AGP = 0.4 * Basic;
        double mergedBasic = Basic + AGP;
        double DA = 0.25 * mergedBasic;
        double HRA = 0.10 * mergedBasic;
        return Basic + AGP + DA + HRA;
    }
}

class Company2 extends Employee 
{
    public Company2(int EID, String Name, double Basic, String City) 
    {
        super(EID, Name, Basic, City);
    }

    @Override
    public double calculateGrossSalary() 
    {
        double AGP = 0.5 * Basic;
        double mergedBasic = Basic + AGP;
        double DA = 0.50 * mergedBasic;
        double HRA = 0.15 * mergedBasic;
        return Basic + AGP + DA + HRA;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Company1 employee1 = new Company1(101, "John", 50000, "New York");
        Company2 employee2 = new Company2(102, "Alice", 60000, "San Francisco");

        System.out.println("Employee 1 Details:");
        employee1.showDetails();
        System.out.println("Gross Salary: " + employee1.calculateGrossSalary());

        System.out.println("\nEmployee 2 Details:");
        employee2.showDetails();
        System.out.println("Gross Salary: " + employee2.calculateGrossSalary());
    }
}
