package mypackage;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String str=sc.nextLine();
		int vowels=0,consonants=0,words=1;
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case 'a':
			case 'e':
			case 'o':
			case 'i':
			case 'u':vowels++;break;
			case ' ':words++; break;
			default: consonants++;
			}
		}
		System.out.println("Number of vowels:"+vowels);
		System.out.println("Number of consonants:"+consonants);
		System.out.println("Number of words:"+words);
	}

}
