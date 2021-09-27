import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Hello {

  public static int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c) == false) {
        map.put(c, 1);
      } else {
        int count = map.get(c);
        count++;
        map.put(c, count);
      }
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }

  private static boolean letterOrDigit(char c) {
    // boolean check
    if (Character.isLetterOrDigit(c)) return true;
    else return false;
  }

  // Operator having higher precedence
  // value will be returned
  static int getPrecedence(char ch) {

    if (ch == '+' || ch == '-') return 1;
    else if (ch == '*' || ch == '/') return 2;
    else if (ch == '^') return 3;
    else return -1;
  }

  static String infixToPostFix(String expression) {

    Stack<Character> stack = new Stack<>();

    String output = new String("");

    for (int i = 0; i < expression.length(); ++i) {

      char c = expression.charAt(i);

      if (letterOrDigit(c)) output += c;
      else if (c == '(') stack.push(c);
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') output += stack.pop();

        stack.pop();
      } else {
        while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {

          output += stack.pop();
        }
        stack.push(c);
      }
    }

    while (!stack.isEmpty()) {
      if (stack.peek() == '(') return "This expression is invalid";
      output += stack.pop();
    }
    return output;
  }

  public static double postfixEval(String postfix) {
    Stack<Double> stack = new Stack<>();
    Scanner scanner = new Scanner(postfix);
    while (scanner.hasNext()) {
      if (scanner.hasNextDouble()) stack.push(scanner.nextDouble());
      else {
        String input = scanner.next();
        char op = input.charAt(0);
        double y = stack.pop();
        double x = stack.pop();
        double z = 0;
        switch (op) {
          case '+':
            z = x + y;
            break;
          case '-':
            z = x - y;
            break;
          case '*':
            z = x * y;
            break;
          case '/':
            z = x / y;
        }
        stack.push(z);
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    String infix = "(80-30)*(40+50/10)";
    System.out.println("infix = " + infix);
    String postfix = infixToPostFix(infix);
    System.out.println("postfix = " + postfix);
    System.out.println(postfixEval(postfix));
  }
}
