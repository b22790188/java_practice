package javapractice;
import java.util.*;

public class hash_practice {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet <Integer>();
		hset.add(36);
		hset.add(15);
		System.out.println(hset);
		
		TreeSet<Integer> ttset = new TreeSet<Integer>();
		ttset.addAll(hset);
		ttset.add(1000);
		System.out.println(ttset);
		
		TreeSet<String> tset = new TreeSet<String>();
		String input;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			input = sc.next();
			tset.add(input);
		}
		SortedSet<String> sset = tset;
		System.out.println(sset.headSet("by"));

	}

}
