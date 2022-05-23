package javapractice;
import java.util.*;
public class Enumtest {

	public static void main(String[] args) {
		int[] arr = {5 , 7 , 2};
		int[] deck = new int[52];
		char suit[] = {'s','h','d','c'};
		String rank[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		String a = "hello";
		String b = "world";
		
		
		Arrays.sort(suit,0,4);
		System.out.println(suit);
		
		System.out.println(a+b);

	}

}
