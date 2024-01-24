package Practice;

abstract class employeeDetails{
	abstract void empname(); //abstract method
	public void empid()  //non-abstract or concrete method
	{
		System.out.println("EMPID : 46281067");
	}
}
class emplyeeName extends employeeDetails{
	void empname()
	{
		System.out.println("EMPNAME : Madhuri");
	}
} 
public class AbstractClass{

	
	public static void main(String[] args)
	{
		emplyeeName a=new emplyeeName();
		a.empname();
		a.empid();
	}

	

}

