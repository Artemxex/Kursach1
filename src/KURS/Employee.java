package KURS;

public class Employee {
    public String employeeName;
    public int employeeDepartment;
    public double employeeSalary;
    public int id;
    public static int count = 0;
    public double employeeSalarySum = 0;
    public static double SalarySum;
    public static double minSalary = 99999999;
    public static double maxSalary = 0;
    public static double average;

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

    public static void info(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void sum(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            SalarySum = SalarySum + list[i].getEmployeeSalary();
        }
        System.out.println("Сумма зарплат сотрудников - " + SalarySum);
    }

    public static void min(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getEmployeeSalary() < minSalary) {
                minSalary = list[i].getEmployeeSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getEmployeeSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой - " + list[i]);
            }
        }
    }


    public static void max(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getEmployeeSalary() > maxSalary) {
                maxSalary = list[i].getEmployeeSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getEmployeeSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой - " + list[i]);
            }
        }

    }

    public static void avg(Employee[] list) {
        average = SalarySum / list.length;
        System.out.println("Средняя зарплата сотрудников - " + average);
    }

    public static void name(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("ФИО сотрудника - " + list[i].getEmployeeName());
        }
    }
}


