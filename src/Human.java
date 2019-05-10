

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
}

