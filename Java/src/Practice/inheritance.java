package Practice;
class parentClass{
	public void parent() {
		System.out.println("Parent Method");
	}
}

class childClass extends parentClass{
	public void child() {
		System.out.println("Child Method");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentClass parent=new parentClass();
		parent.parent();
		
		childClass child=new childClass();
		child.parent();
		child.child();
		
	}

}
