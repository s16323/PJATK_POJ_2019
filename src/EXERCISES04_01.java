/*
Cw 4
Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

class Person {

    private String name;
    private String address;

    public Person() {
        this.name = "Anonymus";
        this.address = "No address";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Person[name = " + name + ", address =" + address + "]";
    }
}

class Student extends Person{

    private String program;
    private int yeaar;
    private double fee;

    public Student(){
        super();
        this.program = "No program added";
        this.yeaar = 2019;
        this.fee = 0.00;
    }

    public Student(String program, int year, double fee){
        super();
        this.program = program;
        this.yeaar = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYeaar() {
        return yeaar;
    }

    public void setYeaar(int yeaar) {
        this.yeaar = yeaar;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return "Student[Person[name = " + super.getName() + ", address =" + super.getAddress() + "],program = " + program +", year = " + yeaar + "]";
    }
}

class Staff extends Person{


}