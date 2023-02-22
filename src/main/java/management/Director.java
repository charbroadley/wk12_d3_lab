package management;

public class Director extends Manager{

    private double budget;

    public Director(double budget, String departmentName, String name, int niNumber, int salary){
        super(departmentName, name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int payBonus(){
        return this.getSalary() /50;
    }


}
