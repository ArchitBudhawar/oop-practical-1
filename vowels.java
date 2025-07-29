package basic;

import java.util.Scanner;

public class vowels {
  public static void main(String args[]) {
      Scanner scanner=new Scanner(System.in);
      char ch=scanner.next().charAt(0);
       if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
           
                char lower = Character.toLowerCase(ch);

                if (lower == 'a' ||  lower == 'e' || lower == 'i'  || lower == 'o' || lower == 'u') {
                    System.out.println("It is a vowel.");
                } else {
                    System.out.println("It is a consonant.");
                }
            } else {
                System.out.println("It is not an alphabet.");
            }
       scanner.close();
  }

}