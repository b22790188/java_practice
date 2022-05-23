package testimport;

interface Math
{	
	public void show();
	public void add(int a, int b);
	public void sub(int a, int b);
	public void div(int a, int b);
	public void mul(int a, int b);
}
class Compute1 implements Math
{	
	protected int ans;
	public void show()
	{
		System.out.println("ans = " + ans);
	}
	public void add(int a, int b)
	{
		ans = a + b;
	}
	public void sub(int a, int b)
	{
		ans = a -b;
	}
	public void mul(int a, int b)
	{
		ans = a * b;
	}
	public void div(int a , int b)
	{
		ans = a / b;
	}
}
public class Interface_Practice {

	public static void main(String[] args) {
		Math cmp = new Compute1();
		cmp.div(4, 2);
		cmp.show();
	}

}
