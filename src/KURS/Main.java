package KURS;

import KURS.Employee;


public class Main {

    public static void main(String[] args) {
        Employee[] list = new Employee[10];
        list[0] = new Employee("Сергеев Михаил Демьянович", 1, 201000);
        list[1] = new Employee("Егоров Авраам Игнатьевич", 2, 169000);
        list[2] = new Employee("Захаров Дональд Святославович", 3, 228420);
        list[3] = new Employee("Дьячков Май Русланович", 4, 136000);
        list[4] = new Employee("Яковлев Рудольф Владленович", 5, 142000);
        list[5] = new Employee("Кузьмина Ульна Вадимовна", 1, 189700);
        list[6] = new Employee("Семёнов Иосиф Тарасович", 2, 236000);
        list[7] = new Employee("Вишнякова Влада Якововна", 3, 123000);
        list[8] = new Employee("Зиновьев Аввакуум Иосифович", 4, 234000);
        list[9] = new Employee("Мишина Эстелла Георгиевна", 5, 246000);
        Employee.info(list);
        Employee.sum(list);
        Employee. min(list);
        Employee.max(list);
        Employee. avg(list);
        Employee.name(list);
    }

}
