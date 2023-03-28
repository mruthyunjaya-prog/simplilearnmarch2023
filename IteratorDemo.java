package mypackage;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("xxx");
		ll.add("yyy");
		System.out.println(ll);//[10, 20, xxx, yyy]
		Iterator iter=ll.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
