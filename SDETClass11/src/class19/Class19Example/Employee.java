package class19.Class19Example;

public class Employee {

    String name;
    int age;
    int baseSalary=30000;
    int baseNoDaysOff=20;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printNoDaysOff(){
        System.out.println(baseNoDaysOff);
    }
}
class Manager extends Employee{
    int bonus ;
    int travelingAllowance;
    void printSalary(){
        super.printSalary();
        System.out.println(bonus+travelingAllowance+baseSalary);
    }
}