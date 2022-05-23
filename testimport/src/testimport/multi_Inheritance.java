package testimport;
interface Data
{
	public void show_data();
}
interface Test
{
	public void show_score();
	public double calcu();
}
class Cstu implements Data , Test
{	
	protected String id;
	protected String name;
	protected int mid;
	protected int fina;
	protected int common;
	Cstu(String id , String name , int mid , int fina , int common)
	{	
		this.id = id;
		this.name = name;
		this.mid = mid;
		this.fina = fina;
		this.common = common;
		show_data();
	}
	public void show_data()
	{
		System.out.println("id : " + id + "name : " + name + "mid : " + mid + "fina : " + fina + "common : " + common);
	}
	public void show_score()
	{
		System.out.println("final score : " + calcu());
	}
	public double calcu()
	{
		return mid * 0.3 + fina * 0.3 + common * 0.4;
	}
}
public class multi_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstu student = new Cstu("A1095556","guo",90 , 80 , 80);
		student.show_score();
	}

}
