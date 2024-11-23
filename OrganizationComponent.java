package Модуль10Prac;

import java.util.ArrayList;
import java.util.List;

abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
    public abstract double getBudget();
    public abstract int getEmployeeCount();
}

class Employee extends OrganizationComponent {
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Сотрудник: " + name + ", Должность: " + position + ", Зарплата: " + salary);
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
}


class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Отдел: " + name);
        for (OrganizationComponent component : components) {
            component.displayInfo();
        }
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (OrganizationComponent component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }

    @Override
    public int getEmployeeCount() {
        int totalCount = 0;
        for (OrganizationComponent component : components) {
            totalCount += component.getEmployeeCount();
        }
        return totalCount;
    }

    public List<OrganizationComponent> getComponents() {
        return components;
    }
}

