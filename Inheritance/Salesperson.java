public class Salesperson extends Employee{

    // private String name;
    // private double salary;
    // private int age;
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age,
                       double commissionPercentage) {
        // this.name = name;
        // this.salary = salary;
        // this.age = age;
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }


    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage =
                    this.commissionPercentage * 1.2;
        }
    }
}
