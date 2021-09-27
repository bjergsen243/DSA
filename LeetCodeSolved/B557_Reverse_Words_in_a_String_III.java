package LeetCodeSolved;

public class B557_Reverse_Words_in_a_String_III {
  public String reverseWords(String s) {
    String[] words = s.split(" ");
    String res = "";
    for (String word : words) {
      for (int i = word.length() - 1; i >= 0; i--) {
        res += word.charAt(i);
      }
      res += " ";
    }
    return res.trim();
  }
}
