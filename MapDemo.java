package mypackage;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		HashMap hm=new HashMap();
		hm.put("monitor", 5000);
		hm.put("keyboard", 500);
		hm.put("mouse", 30);
		hm.put("ups", 2000);
		hm.put("speakers", 1000);
		System.out.println(hm);//{keyboard=500, mouse=30, speakers=1000, ups=2000, monitor=5000}
		//LinkedHashMap
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("monitor", 5000);
		lhm.put("keyboard", 500);
		lhm.put("mouse", 30);
		lhm.put("ups", 2000);
		lhm.put("speakers", 1000);
		System.out.println(lhm);//{monitor=5000, keyboard=500, mouse=30, ups=2000, speakers=1000}
		//TreeMap
		TreeMap tm=new TreeMap();
		tm.put("monitor", 5000);
		tm.put("keyboard", 500);
		tm.put("mouse", 30);
		tm.put("ups", 2000);
		tm.put("speakers", 1000);
		System.out.println(tm);//{keyboard=500, monitor=5000, mouse=30, speakers=1000, ups=2000}
		System.out.println(tm.descendingMap());//{ups=2000, speakers=1000, mouse=30, monitor=5000, keyboard=500}
	}

}
