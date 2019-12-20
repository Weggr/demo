package demo;

public class Library {
  public int addition(int x, int y){
     return x+y;
 }

 public long carre(long x){
     return x*x;
 }

 public double divide_y_by_x(double y, double x) {
     try {
         return y/x;
     } catch (ArithmeticException e) {
         System.out.println("Nope you should not divide a number by Zero because I'm racist against Zero's.");
         return 0;
     }
 }
}
