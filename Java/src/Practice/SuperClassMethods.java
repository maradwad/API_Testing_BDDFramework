package Practice;

class superClass{
	public void commonMethod() {
		System.out.println("Super Method");
	}
}
class subClass extends superClass{
	public void commonMethod() {
		 // Call the superclass method using super
		super.commonMethod();
		System.out.println("Sub Method");
	}
}
public class SuperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 subClass s=new subClass();
		 s.commonMethod();
	}

}
