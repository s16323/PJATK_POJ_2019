/*
Cw 2
Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf

Create test class for eachUML diagram
 */

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {

        setSalary(salary + salary* percent/100);
        return salary;
    }

    public String toString(){

        return "Employee[id = " + getId() + ", Name = " + getName() + " , salary = " + getSalary() + "]";
    }
}
