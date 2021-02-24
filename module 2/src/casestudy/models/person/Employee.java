package casestudy.models.person;

public class Employee {
    private String id;
    private String nameEmployee;
    private String ageEmployee;
    private String employeeAddress;

    public Employee(String id, String nameEmployee, String ageEmployee, String employeeAddress) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.employeeAddress = employeeAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", ageEmployee='" + ageEmployee + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }
}
