package Practice;

interface interface1{
	abstract void interface1();  //abstract method
	
}

interface interface2{
	void interface2();
}

interface interface3{
	void interface3();
}

class interfaceclass implements interface1,interface2,interface3{

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("Interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2");

	}

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1");

	}
	
}
public class InterfaceClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceclass i=new interfaceclass();
		i.interface1();
		i.interface2();
		i.interface3();
	}

}
