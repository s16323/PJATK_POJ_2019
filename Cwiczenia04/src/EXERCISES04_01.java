/*
Autorzy:   Artur Dembicki 16323
           Aleksander Mojzych 15595
Cw 4 Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

class Person {

    private String name;
    private String address;

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

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
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

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString(){
        return "Staff[Person[name = " + super.getName() + ", address =" + super.getAddress() + "],school = " + school +", pay = " + pay + "]";
    }
}