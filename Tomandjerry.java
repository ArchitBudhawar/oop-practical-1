package basic;
public class Tomandjerry {
	 public static void main(String[] args) {
		  int tomsbag = 3;
		  int jerrysbag = 5;
		  System.out.println("Before swapping:");
		  System.out.println("tom's bag has "+ tomsbag +"apples.");
		  System.out.println("jerry's bag has "+jerrysbag+"apples");
		  int temp=tomsbag;
		  tomsbag=jerrysbag;
		  jerrysbag=temp;
		  System.out.println("After swapping:");
		  System.out.println("Tom's bag has "+tomsbag+"apples.");
		  System.out.println("jerry's bag has "+jerrysbag+"apples.");
	 }

}
