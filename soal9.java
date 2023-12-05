import java.util.Stack;

public class soal9 {
  public static boolean isBracketSequenceValid(String expression) {
    Stack<Character> stack = new Stack<>();

    for (char c : expression.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else if (c == ')' || c == ']' || c == '}') {
        if (stack.isEmpty()) {
          return false;
        }

        char top = stack.pop();
        if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  /**
  * @param args
  */
  public static void main(String[] args) {
    String expression1 = "((2 + 3) * 5)"; // Urutan kurung benar
    String expression2 = "((2 + 3) * 5"; // Kurung tutup kurang
    String expression3 = "((2 + 3) * 5))"; // Kurung buka kurang
    String expression4 = "((2 + 3) * 5]"; // Kurung buka dan tutup tidak cocok

    System.out.println(expression1 + " : " + isBracketSequenceValid(expression1));
    System.out.println(expression2 + " : " + isBracketSequenceValid(expression2));
    System.out.println(expression3 + " : " + isBracketSequenceValid(expression3));
    System.out.println(expression4 + " : " + isBracketSequenceValid(expression4));

  }
}