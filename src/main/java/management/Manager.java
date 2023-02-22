package management;
import staff.Employee;

    public class Manager extends Employee {

    private String departmentName;

        public Manager(String departmentName, String name, int niNumber, int salary){
        super(name, niNumber, salary);
        this.departmentName = departmentName;
    }


        public String getDepartmentName() {
            return departmentName;
        }


}
