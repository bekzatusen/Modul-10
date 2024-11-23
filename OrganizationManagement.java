package Модуль10Prac;

public class OrganizationManagement {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee emp1 = new Employee("Жусипали Карина", "Менеджер", 70000);
        Employee emp2 = new Employee("Кабдрахманова Айжан", "Разработчик", 80000);
        Employee emp3 = new Employee("Шаймерден Акбота", "Аналитик", 75000);

        Department devDepartment = new Department("Отдел разработки");
        devDepartment.addComponent(emp2);
        devDepartment.addComponent(emp3);

        Department hrDepartment = new Department("Отдел кадров");
        hrDepartment.addComponent(emp1);

        Department mainDepartment = new Department("Главный офис");
        mainDepartment.addComponent(devDepartment);
        mainDepartment.addComponent(hrDepartment);

        mainDepartment.displayInfo();

        System.out.println("Общий бюджет отдела разработки: " + devDepartment.getBudget());
        System.out.println("Общий бюджет отдела кадров: " + hrDepartment.getBudget());
        System.out.println("Общий бюджет главного офиса: " + mainDepartment.getBudget());

        System.out.println("Общее количество сотрудников в главном офисе: " + mainDepartment.getEmployeeCount());
    }
}