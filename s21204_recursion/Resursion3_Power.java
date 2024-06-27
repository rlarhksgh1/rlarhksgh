package s21204_recursion;

public class Resursion3_Power {

   public static int power(int base, int exponent) {
      if (exponent == 0) {
         return 1;
      } else {
         return base * power(base, exponent - 1);
      }
   }

   public static void main(String[] args) {
      final int Base = 2;
      final int Exponent = 8;
      System.out.println(Base + "의 " + Exponent + "승 = " + power(Base, Exponent));
   }
}
