package mypackage;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mobileNos=new ArrayList<Integer>();
		mobileNos.add(1111);
		mobileNos.add(2222);
		mobileNos.add(3333);
		mobileNos.add(1111);
		mobileNos.add(4444);
		mobileNos.add(5555);
		mobileNos.add(3333);
		mobileNos.add(6666);
		mobileNos.add(7777);
		mobileNos.add(6666);
		mobileNos.add(5555);
		System.out.println(mobileNos);
		Set<Integer> uniqueMobileNos=new LinkedHashSet<Integer>();
		uniqueMobileNos.addAll(mobileNos);
		System.out.println(uniqueMobileNos);
	}

}
