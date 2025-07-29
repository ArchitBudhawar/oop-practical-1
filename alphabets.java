package basic;

import java.util.Scanner;

public class alphabets {
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    char ch=scanner.next().charAt(0);
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
           System.out.println("It is a character");
        } else {
            System.out.println("It is NOT a character");
        }
    scanner.close();
    
}
}