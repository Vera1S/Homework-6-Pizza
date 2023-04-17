package Homework;

public class HW6Radius {

    public static void main(String[] args) {
        // S(r) = 3.14 * r^2

        double x = 24;
        double y = 28;
        System.out.println("проверка " + (Math.PI * ((x / 2) * (x / 2))));
        System.out.println("проверка " + (Math.PI * ((y / 2) * (y / 2))));

        Radius2 radius2 = new Radius2();
        x = radius2.Radius2(x);
        y = radius2.Radius2(y);

        double r = (y - x) * 40;

        System.out.println(x);
        System.out.println(y);
        System.out.println(r);


    }
}