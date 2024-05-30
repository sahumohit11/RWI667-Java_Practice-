class Person{
private String name;
public void setName(String name) {
        this.name = name;
}
public String getName() {
        return name;
}
public void displayInfo() {
        System.out.println("Name: " + name);
}
}

class Employee extends Person{

private String employeeId;
public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
}
public String getEmployeeId() {
        return employeeId;
}

public void displayEmployeeInfo() {
displayInfo();
System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee{
private String department;

public void setDepartment(String department) {
        this.department = department;
}
public String getDepartment() {
        return department;
}
    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

public class MultiLevelInheritanceEx{
 public static void main(String[] args) {

Manager m=new Manager();
       
        m.setName("Bob");
        m.setEmployeeId("E456");
        m.setDepartment("Marketing");
        m.displayManagerInfo();
    }
}


