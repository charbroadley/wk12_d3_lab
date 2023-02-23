package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private int salary;

    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;

    }

    public double raiseSalary(double payRise) {
        if (payRise >= 0) {
            return this.salary + payRise;
        } else {
            return this.salary;
        }
    }

    public int payBonus(){
        return this.salary/100;
    }

    public int getSalary(){
        return this.salary;
    }

    public String changeName(String newName) {
        if (newName != null) {
        return this.name = newName;
        } else {
            return this.name;
        }
    }
//    public void setName(String name) {
//        if (name != null && name != ""){
//            this.name = name;
//        }
//    }
}
