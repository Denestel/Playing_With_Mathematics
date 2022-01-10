import java.util.*;

public class Math {
    public static void main (String[args]) {

      Scanner input = new Scanner(System.in);
      int[] numSet = 2;

      System.out.println("What operation are you performing?");
      Sytem.out.println("+, -, /, *, ^");
      String op = input.next();

      switch (op) {

        case "+":
                setNumSet();

      }

    }
    public int[] getNumSet{
      return numSet;
    }
    public static setNumSet {
      System.out.println("What are your two numbers?");
      numSet[0] = input.nextInt();
      numSet[1] =input.nextInt();
    }
    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int subtr(int num1, int num2) {
        return num1-num2;
    }
    public int divi(int num1, int num2) {
        return num1/num2
    }
    public int multi(int num1, int num2) {
        return num1*num2;
    }
    public int sq(int num) {
      return num*num;
    }
}
