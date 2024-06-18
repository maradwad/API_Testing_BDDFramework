package collections;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("madhuri");
		list.add("savi");
		list.add("prashant");
		list.add("keshav");
		list.add("shubham");
		
		System.out.println(list);
		list.add(3, "vrinda");
		System.out.println(list);
		System.out.println(list.contains("madhuri"));
		System.out.println(list.get(4));
		System.out.println(list.indexOf("vrinda"));
		
		//iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		list.remove("prashant");
		list.set(1, "ovi");
		Collections.sort(list);
		Object[] array=list.toArray();
		for(Object o:array)
		{
			System.out.println(o);
		}
	}

}
