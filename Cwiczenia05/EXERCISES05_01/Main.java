/*
Autor: Artur Dembicki 16323
Cw 5, Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf
 */

// Write a program that allocates 10 points in an array of MyPoint, and initializes to (1, 1), (2, 2), ... (10, 10)

public class Main {

    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(1,1);

        //Array<MyPoint> list = new Array();
        //List<MyPoint> list = new

        MyPoint[] my_points = new MyPoint[10];      // Initialize an array of 10 elements of type MyPoint

//        System.out.println(my_points.length);
//        System.out.println(my_points[0]);
//        System.out.println(my_points[9]);
//
//        my_points[0] = new MyPoint(1,1);
//        System.out.println(my_points[0]);


//        for (int i = 0; i < my_points.length; i++){
//
//            my_points[i] = new MyPoint(i+1,i+1);
//            System.out.println(my_points[i]);
//        }

        int i = 0;
        for (MyPoint point : my_points){

            my_points[i] = new MyPoint(i+1, i+1);
//            System.out.println(my_points[i]);
            i++;
        }
    }
}
