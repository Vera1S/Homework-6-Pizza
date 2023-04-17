package Homework;

public class Radius2 {

    public double Radius2(double w) {
//        double result1 = div(x / 2);
//        double result2 = pow(Math.pow((x / 2), 2));
//        double result3 = mul(Math.PI * result2);


        double method1 = mul(pow(div(w)));
        return  method1;
    }

    private double div(double w){
        return w / 2;
    }

     private double pow(double w) {
        return Math.pow(w, 2);
    }
    private double mul(double w) {
        return (Math.PI * w);
    }
//    private double mul2(double x) {
//        return (x * 40);
//    }

//    public void printResult(double result3){
//        System.out.println("Result (via HW6Radius) = " + result3);
//    }

}
//   public double method1(double x){
//       double x = (Math.PI * ((x / 2) * (x / 2)));
//        System.out.println(x);
//
//    }
//    public double method2(double y){
//        double y = ("Result (via HW6Radius) = " + (Math.PI * ((y / 2) * (y / 2)));
//        System.out.println(y);
//
//        return printResult(y);
//
//    }


