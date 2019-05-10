/*
Cw 2
Zad 6
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf
Write a program to print the name, salary and date of joining of 8 employees in a company.Use arrayList of objects.
 */
import java.util.Date;
import java.util.ArrayList;

class EmployeeZad5{

    private String name;
    private int salary;
    private String dateOfJoining;

    public EmployeeZad5(String name, int salary, String dateOfJoining) {

        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }
}


public class EmployeesArrayPrinter {

    private ArrayList<EmployeeZad5> listOfEmployees;

    public EmployeesArrayPrinter(ArrayList<EmployeeZad5> listOfEmployees){
        this.listOfEmployees = listOfEmployees;
    }

    public void printList() {

        for (EmployeeZad5 empl : listOfEmployees) {
            System.out.println(empl.getName() + " " + empl.getSalary() + " " + empl.getDateOfJoining());
        }
    }
}

