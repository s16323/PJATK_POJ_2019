/*
Autorzy:   Artur Dembicki 16323
Cw 2
Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf

Create test class for each UML diagram
 */


public class EmployeeTest {


    public static void main(String[] args) {

        Employee mietek = new Employee(100, "Mietek", "Kowalski", 3000);

        System.out.println(mietek.getFirstName());
        System.out.println(mietek.getLastName());
        System.out.println(mietek.getSalary());
        System.out.println(mietek.getName());
        System.out.println(mietek.raiseSalary(10));
        System.out.println(mietek.getSalary());
        System.out.println(mietek.toString());


    }



}


