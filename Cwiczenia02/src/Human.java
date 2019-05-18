/*
Autorzy:   Artur Dembicki 16323
Cw 1 Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_02_2019.03.23.pdf

Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć, numer indeksu, rozmiar stopy.
Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale, getFeetSize, getIndexNumber.
Stwórz także odpowiednie metody set. Stwórz przykładowy obiekt zwierający Twoje dane.
 */

public class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String gender;
    private int index;
    private int foot;


    // konstruktor
    public Human(int age, int weight, int height, String name, String gender, int index, int foot) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;
        this.index = index;
        this.foot = foot;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public boolean isMale(String gender) {
        if (gender == "male")
            return true;
        else
            return false;
    }
}

