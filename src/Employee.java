public class Employee {
    public String employeeName;
    public int employeeDepartment;
    public double employeeSalary;
    public int id;
    public static int count = 0;
    public double employeeSalarySum = 0;

    public Employee(String employeeName, int employeeDepartment, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
        count++;
        this.id = count;

    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getEmployeeDepartment() {
        return this.employeeDepartment;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }

    public int getCount() {
        return Employee.count;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return id + "." + " ФИО - " + employeeName + "; Отдел - " + employeeDepartment + "; Зарплата - " + employeeSalary;
    }
    public void info(Employee[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}