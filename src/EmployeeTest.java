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


