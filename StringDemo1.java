package mypackage;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="xyz";
		if(s1.compareTo(s2)<0)
			System.out.println(s1+" is less than "+s2);
		else if(s1.compareTo(s2)>0)
			System.out.println(s1+" is greater than "+s2);
		else
			System.out.println(s1+" is equal to "+s2);
	}

}
