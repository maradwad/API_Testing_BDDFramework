package Practice;

import java.util.*;
public class HashMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"Madhuri");
		m.put(2, "Prisha");
		m.put(3,"Parag");
		for(Map.Entry<Integer,String> i:m.entrySet())
		{
			System.out.println("EmpId:"+i.getKey()+" "+"EName:"+i.getValue());
		}
	}

}
