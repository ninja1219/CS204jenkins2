import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    Calculator calc = new Calculator();
    String input = "";
    System.out.println("Welcome to the Calculator!");
    System.out.println("Enter Commands (enter \"done\" to end): ");

    while (!input.equals("done")) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      input = reader.readLine();
      String[] splitInput = input.split("\\s+");

      if (splitInput[0].equals("add")) {
        int result = calc.add(Integer.parseInt(splitInput[1]), Integer.parseInt(splitInput[2]));
        System.out.println(result);
      }
      else if (splitInput[0].equals("subtract")) {
        int result = calc.subtract(Integer.parseInt(splitInput[1]), Integer.parseInt(splitInput[2]));
        System.out.println(result);
      }
      else if (splitInput[0].equals("multiply")) {
        int result = calc.multiply(Integer.parseInt(splitInput[1]), Integer.parseInt(splitInput[2]));
        System.out.println(result);
      }
      else if (splitInput[0].equals("divide")) {
        int result = calc.divide(Integer.parseInt(splitInput[1]), Integer.parseInt(splitInput[2]));
        System.out.println(result);
      }
      else if (splitInput[0].equals("fib")) {
        int result = calc.fibonacciNumberFinder(Integer.parseInt(splitInput[1]));
        System.out.println(result);
      }
      else if (splitInput[0].equals("binary")) {
        String result = calc.intToBinaryNumber(Integer.parseInt(splitInput[1]));
        System.out.println(result);
      }
      else {
        input = "done";
        System.out.println("Bad input");
      }
    }
  }
}
