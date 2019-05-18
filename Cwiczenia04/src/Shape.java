/*
Autorzy:   Artur Dembicki 16323
           Aleksander Mojzych 15595
Cw 4
Zad 4
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(boolean filled){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public class Circle extends Shape {
        private double radius = 1.0;

        public Circle(){

        }
        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled){
            this.radius = radius;
            this.setColor(color);
            this.setFilled(filled);
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            return radius;
        }
        public double getPerimeter(){
            return radius;
        }
    }

    public class Rectangle extends Shape {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle(){

        }
        public Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }
        public Rectangle(double width, double length, String color, boolean filled){
            this.width = width;
            this.length = length;
            this.setColor(color);
            this.setFilled(filled);
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    /*public double getArea(){
       return
    }
    public double getPerimeter(){
        return
    } */
    }

}