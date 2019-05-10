
/*
Zadania z POJ 2019
Autor: Artur Dembicki 16323
email: s16323@pjwstk.edu.pl
repo: https://github.com/s16323/PJATK_POJ_2019
*/


import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Flagi.wyswietlFlage(1);
        Human artur = new Human(33, 85, 176, "Artur", "male", 16323, 44);
        System.out.println(artur.getAge());

        InvoiceItem item = new InvoiceItem("0001", "deskrypszon", 666, 6.90);
        System.out.println(item.toString());
        System.out.println(item.getTotal());

        Account Account001 = new Account("001", "Account001", 1234);
        Account Account002 = new Account("002", "Account002", 50);
        System.out.println(Account001.toString());
        Account001.credit(100);
        System.out.println(Account001.toString());
        Account001.transferTo(Account002, 1000);
        System.out.println(Account001.toString());
        System.out.println(Account002.toString());

        Date testDaty = new Date(1, 8, 2019);
        System.out.println(testDaty.toString());


        // Zadanie 6 - Printing out arrayList:
        // Pracownicy:
        EmployeeZad5 emp1 = new EmployeeZad5("aaa", 12544, "01-01-2019");
        EmployeeZad5 emp2 = new EmployeeZad5("bbb", 15445, "02-01-2019");
        EmployeeZad5 emp3 = new EmployeeZad5("ccc", 4545, "03-01-2019");
        EmployeeZad5 emp4 = new EmployeeZad5("ddd", 4555, "01-02-2019");
        EmployeeZad5 emp5 = new EmployeeZad5("fff", 3456, "01-04-2019");
        EmployeeZad5 emp6 = new EmployeeZad5("ggg", 55548, "11-11-2019");
        EmployeeZad5 emp7 = new EmployeeZad5("hhh", 5000, "01-01-2020");
        EmployeeZad5 emp8 = new EmployeeZad5("iii", 4000, "01-01-2020");

        //Dodanie pracownikw do listy:
        ArrayList<EmployeeZad5> listOfEmployees = new ArrayList<EmployeeZad5>(0);
        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        listOfEmployees.add(emp4);
        listOfEmployees.add(emp5);
        listOfEmployees.add(emp6);
        listOfEmployees.add(emp7);
        listOfEmployees.add(emp8);

        EmployeesArrayPrinter employeesArrayPrinter = new EmployeesArrayPrinter(listOfEmployees);
        employeesArrayPrinter.printList();


    }
}

