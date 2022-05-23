package javapractice;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		enum character{jett,phoeix,kayo,sky,killjoy};
		
		character team[] = character.values();
		
		int[] test = {0 , 1 ,2 ,3};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 4 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 4 ; i++)
		{
			System.out.println(test[i]);
		}
		
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(team[i]);
		}
		
		sc.close();
	}

}
