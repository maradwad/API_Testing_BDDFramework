package collections;

import java.util.*;
import java.util.LinkedList.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Goa");
		list.add("Latur");
		list.add("Nanded");
		list.add("Nagpur");
		System.out.println(list);
		
		list.addFirst("Satara");
		list.addLast("Sangali");
		System.out.println(list.getFirst()+" "+list.getLast());
		
		list.pop();
		System.out.println(list);
		System.out.println(list.get(2));
		
		// iterator reverse
		Iterator itr=list.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
